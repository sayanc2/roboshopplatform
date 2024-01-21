package com.org1.platform.roboshop.exception;

import java.util.Date;

public class RoboshopErrorModel {

	private String status;
	private String message;
	private String httpStatus;
	private Date currentTime;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(String httpStatus) {
		this.httpStatus = httpStatus;
	}
	public Date getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}
	public RoboshopErrorModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoboshopErrorModel(String status, String message, String httpStatus, Date currentTime) {
		super();
		this.status = status;
		this.message = message;
		this.httpStatus = httpStatus;
		this.currentTime = currentTime;
	}


	
}
