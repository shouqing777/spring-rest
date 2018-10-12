package com.shouqing777.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月15日 下午1:05:50
* 類說明
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class Student {
	
	public String firstName;
	
	public String lastName;
	
	public Student() {
	
	}
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
