/******************************************************************************
 * Copyright (C) 2017  ShenZhen INNOPRO Co.,Ltd
 * All Rights Reserved.
 * 本软件为精华隆智慧感知科技（深圳）股份有限公司开发研制。未经本公司正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.yx.cdss.extract.provider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName: SwaggerConfig
 * @version 2.0 
 * @Desc: TODO
 * @author Jack
 * @date 2018年8月16日下午3:57:17
 * @history v2.0
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket testApi(){
		Docket docket = new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(testApiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.yx.cdss.extract.provider"))
        .paths(PathSelectors.any())
        .build();
		;
		return docket;
	}
	
	
	private ApiInfo testApiInfo() {
        ApiInfo apiInfo = new ApiInfo("Test相关接口",//大标题
                "Test相关接口，主要用于测试.",//小标题
                "1.0",//版本
                "",
                "Angel",//作者
                "SpringBoot API接口",//链接显示文字
                ""//网站链接
        );
        return apiInfo;
    }
	

}
