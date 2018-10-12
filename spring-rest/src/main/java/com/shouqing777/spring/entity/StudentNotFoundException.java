package com.shouqing777.spring.entity;
/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月15日 下午9:41:55
* 類說明
*/
public class StudentNotFoundException extends RuntimeException {

	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public StudentNotFoundException(String message) {
		super(message);
	}

	public StudentNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
