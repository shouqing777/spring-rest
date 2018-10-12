package com.shouqing777.spring.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月14日 下午11:10:01
* 類說明
*/

@RestController
@RequestMapping("/rest")
public class myRestController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}

}
