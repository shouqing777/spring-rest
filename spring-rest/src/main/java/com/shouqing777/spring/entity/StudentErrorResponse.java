package com.shouqing777.spring.entity;
/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月15日 下午9:39:56
* 類說明
*/
public class StudentErrorResponse {
	
	private int status;
	private String message;
	private long timeStamp;
	
	public StudentErrorResponse() {
		
	}
	public StudentErrorResponse(int status, String message, long timeStamp) {
		super();
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
