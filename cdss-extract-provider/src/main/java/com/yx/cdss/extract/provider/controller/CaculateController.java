package com.yx.cdss.extract.provider.controller;

import com.yx.cdss.extract.provider.common.Result;
import com.yx.cdss.extract.provider.serice.calcu.CalculateService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaculateController {

    @Autowired
    private CalculateService calculateService;
    @ApiOperation(value = "计算服务模块1" )
    @RequestMapping(value = "/calculate1", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Result calculate1(@RequestParam String calcuData) {
        System.out.println("接收到参数===>"+calcuData);
        String batchT = "第1批次";
        Integer result = calculateService.caculate(calcuData,batchT);
        System.out.println("线程ID:"+Thread.currentThread().getId()+" ,"+batchT+" 计算结果："+result);
        return new Result();

    }

}
