package com.shouqing777.spring.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.shouqing777.spring.entity.StudentErrorResponse;
import com.shouqing777.spring.entity.StudentNotFoundException;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月15日 下午10:46:58
* 類說明
*/



@ControllerAdvice
public class StudentRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception){
		
		StudentErrorResponse error = new StudentErrorResponse();
		
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exception.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleExcetption(Exception exception){
		
		StudentErrorResponse error = new StudentErrorResponse();
		
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);	
	}
	
}
