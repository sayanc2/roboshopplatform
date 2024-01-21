package com.org1.platform.roboshop.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RoboshopGlobalExcpHandlr {

	@ExceptionHandler(value= {RoboshopRootException.class})
	public ResponseEntity<RoboshopErrorModel> duplicateException(Exception ex){
		RoboshopErrorModel errorModel = new RoboshopErrorModel("Operation failed",ex.getMessage(),HttpStatus.BAD_REQUEST.value()+"",new Date());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorModel);
	}

}
