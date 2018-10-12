package com.shouqing777.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月14日 下午10:47:45
* 類說明
*/
@Configuration
@EnableWebMvc
//@ComponentScan({"com.shouqing777.spring.config","com.shouqing777.spring.controller"})
//@ComponentScan({"com.shouqing777.spring.config","com.shouqing777.spring.controller"})
@ComponentScan({"com.shouqing777.spring.config","com.shouqing777.spring.controller","com.shouqing777.spring.restcontroller"})

//,"com.shouqing777.spring.restcontroller"
public class AppConfig {
	
	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
		
	}

}
