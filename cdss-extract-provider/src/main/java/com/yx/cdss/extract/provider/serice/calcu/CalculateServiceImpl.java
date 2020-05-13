package com.yx.cdss.extract.provider.serice.calcu;

import com.yx.cdss.extract.provider.common.lock.DistributeSharedLock;
import com.yx.cdss.extract.provider.util.TCPClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.concurrent.TimeUnit;

@Service("calculateService")
public class CalculateServiceImpl implements CalculateService {

    @Override
    public synchronized Integer caculate(String dataPacket,String batchT) {
        DistributeSharedLock lock = new DistributeSharedLock("/calculate-lock");
        int result = 0;
        try {
            if(lock.tryLock(60, TimeUnit.SECONDS)) {
                String[] data = dataPacket.split(",");
                long threadId = Thread.currentThread().getId();
                // #start# 标志开始
                String ack = TCPClient.Builder.send("start#batchT#" + threadId);
                // OK,代表计算服务准备就绪，可以开始传输计算数据值
                if ("OK".equals(ack)) {
                    for (int i = 0; i < data.length; i++) {
                        String msg = (i + 1) + "," + data[i] + "," + threadId;
                        TCPClient.Builder.send(msg);
                    }
                }
                // #end#标记结束
                String calR = TCPClient.Builder.send("end#batchT#" + Thread.currentThread().getId());
                if (!StringUtils.isEmpty(calR)) {
                    result = Integer.valueOf(calR);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            TCPClient.Builder.close();
            lock.release();
        }
        return result;
    }
}
