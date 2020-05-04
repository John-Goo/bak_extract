
package com.yx.cdss.extract.provider.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yx.cdss.extract.provider.serice.cure.ResponseBo;

import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONObject;

/**
 * @ClassName: DemoController
 * @version 2.0
 * @Desc: 模擬死鎖現象
 * @author Jack
 * @date 2019年1月25日上午11:02:10
 * @history v2.0
 *
 */
@RestController
public class DeadLockController {

	@ApiOperation(value = "模拟线程死锁", notes = "模拟线程死锁")
	@RequestMapping(value = "/simulateDeadLock", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public ResponseBo simulateDeadLock(@RequestBody JSONObject requestBo) {
		System.out.println("====>接收到信息："+requestBo);
		ResponseBo resp = new ResponseBo();
		MyResource r1 = new MyResource(888);
		MyResource r2 = new MyResource(999);
		Thread t1 = new Thread(new LockThread1(r1, r2));
		t1.setName("ThreadLock1");
		Thread t2 = new Thread(new LockThread2(r1, r2));
		t2.setName("ThreadLock2");
		t1.start();
		t2.start();
		resp.setMsg("You are Success!");
		return resp;
	}

	class LockThread1 implements Runnable {

		private MyResource r1;
		private MyResource r2;

		public LockThread1(MyResource r1, MyResource r2) {
			super();
			this.r1 = r1;
			this.r2 = r2;
		}

		@Override
		public void run() {
			while (true) {
				synchronized (r1) {
					System.out.println("=== 线程[" + Thread.currentThread().getName() + "-"
							+ Thread.currentThread().getId() + "]获得了 R1 锁");
					synchronized (r2) {
						System.out.println("=== 线程[" + Thread.currentThread().getName() + "-"
								+ Thread.currentThread().getId() + "]获得了  R2 锁");
					}
				}
			}
		}
	}

	class LockThread2 implements Runnable {

		private MyResource r1;
		private MyResource r2;

		public LockThread2(MyResource r1, MyResource r2) {
			super();
			this.r1 = r1;
			this.r2 = r2;
		}

		@Override
		public void run() {
			while (true) {
				synchronized (r2) {
					System.out.println("=== 线程[" + Thread.currentThread().getName() + "-"
							+ Thread.currentThread().getId() + "获得了 R2 锁");
					synchronized (r1) {
						System.out.println("=== 线程[" + Thread.currentThread().getName() + "-"
								+ Thread.currentThread().getId() + "]获得了 R1 锁");
					}
				}
			}
		}
	}

	class MyResource {

		// ��Դ�����
		private Integer no;

		public MyResource(Integer no) {
			super();
			this.no = no;
		}

		public Integer getNo() {
			return no;
		}

		public void setNo(Integer no) {
			this.no = no;
		}
	}

}
