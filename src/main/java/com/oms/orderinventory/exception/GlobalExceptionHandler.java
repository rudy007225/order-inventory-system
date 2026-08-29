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


/*
* AppException.java — abstract-style base exception (extends RuntimeException), 
                    * carries message + HttpStatus, 
                    * protected constructor(only subclasses can call it).
* 
* ResourceAlreadyExistsException.java — extends AppException, 
                                       * public constructor 
                                       * taking only message, 
                                       * hardcodes HttpStatus.CONFLICT internally.
* 
* GlobalExceptionHandler.java — @RestControllerAdvice class with two 
							  * @ExceptionHandler methods: one for AppException(dynamic status from ex.getStatus()), 
							  * one generic Exception fallback (always 500, safe generic message, 
							  * real error only logged server-side via ex.printStackTrace()).
* 
*/





