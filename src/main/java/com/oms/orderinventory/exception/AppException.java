package com.oms.orderinventory.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class AppException extends RuntimeException{

	private HttpStatus status;

	protected AppException(String message, HttpStatus status){
		super(message);
		this.status = status;
	}
	
	
	
}
	
	