package com.xuyajie.controller;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;
/**
 * 
* @author xuyajie 
* @date 2018年5月29日 下午5:09:20 
* @Description: spring boot 启动类
 */
@SpringBootApplication
public class SharesApplication extends SpringBootServletInitializer implements WebApplicationInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SharesApplication.class);
	}

	public static void main(String[] args) throws IOException, Exception  {
		SpringApplication.run(SharesApplication.class, args);
	}

}
