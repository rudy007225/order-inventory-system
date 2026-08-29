package com.oms.orderinventory.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.oms.orderinventory.util.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(AppException.class)
	public ResponseEntity<ApiResponse<?>> appExceptionHandler(AppException ex){
		ex.printStackTrace();
		return ResponseEntity.status(ex.getStatus())
				.body(ApiResponse.error(ex.getMessage()));
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiResponse<?>> genericExceptionHandler(Exception ex){	
		ex.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(ApiResponse.error("Something went wrong. Please try again later!!!"));
	}
}
