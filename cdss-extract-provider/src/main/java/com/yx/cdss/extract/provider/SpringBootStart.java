package com.yx.cdss.extract.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


// com.yx.cdss.extract.provider.SpringBootStart
@MapperScan("com.yx.cdss.extract.model.mapper")
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages="com.yx.cdss.extract.provider")
 public class SpringBootStart {
	
	/**
	 * -XX:+UseConcMarkSweepGC
	 * -XX:+HeapDumpOnOutOfMemoryError
	 * VM-Argus:
	 	  -verbose:gc 
		  -Xloggc:gc.log 
		  -Xms20M -Xmx20M 
		  -XX:+PrintGCDetails 
		  -XX:SurvivorRatio=8 
		  -XX:+HeapDumpOnOutOfMemoryError
	 * @param args 
	 */
	public static void main(String[] args) {

		/**
		 *  主方法启动入口
		 */
		SpringApplication.run(SpringBootStart.class, args);

	}
}
