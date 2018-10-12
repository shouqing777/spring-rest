package com.shouqing777.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月14日 下午11:10:01
* 類說明
*/
//@RestController
@Controller
@RequestMapping("/jsp")
public class mySpringController {

	@GetMapping("/hello")
	public String newJsp() {
		return "newPage";
	}

}
