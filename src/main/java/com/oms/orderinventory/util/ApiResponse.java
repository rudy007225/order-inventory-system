package com.oms.orderinventory.util;

/*
 * Method 1 — success()
 * Name       : success
 * Type       : static
 * Returns    : ApiResponse<T>
 * Parameters : String message, T data
 * Sets       : success = true
        	 message = message
             data    = data
             timestamp = LocalDateTime.now()
             
 Method 2 — error()

Name       : error
Type       : static
Returns    : ApiResponse<T>
Parameters : String message only
Sets       : success = false
             message = message
             data    = null
             timestamp = LocalDateTime.now()
             
 */

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ApiResponse<T>  {
	
	Boolean success;
	String message;
	T data;
	LocalDateTime timeStamp;
	
	public static <T> ApiResponse<T> success(String message, T data){
		return ApiResponse.<T>builder()
				.success(true)
				.message(message)
				.data(data)
				.timeStamp(LocalDateTime.now())
				.build();
	}
	
	public static <T> ApiResponse<T> error(String message){
		return ApiResponse.<T>builder()
				.message(message)
				.build();
	}
}

/*
 * Edge Cases ApiResponse Handles : 
 * 
 * 1. Error response   → data is null, success is false
 * 2. Success response → data has value, success is true
 * 3. Timestamp        → always auto-set to current time
 * 
 */