package com.yx.cdss.extract.provider.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		// 实例对象 
		Object demo = new DemoInterface();
		System.out.println(demo.getClass().getName());
		String cls = demo.getClass().getName();
		
		Class<?> c = Class.forName(cls);
		
		Method method=c.getMethod("execute", RequestBo.class);
		
		
		// 接收参数
		RequestBo bo = new RequestBo();
		bo.setName("john");
		bo.setAddr("sz");
		
		Object msg = method.invoke(demo, new Object[] {bo});
		RequestBo retBo=(RequestBo) msg;
		System.out.println(retBo.getAddr());
		
	}

}
