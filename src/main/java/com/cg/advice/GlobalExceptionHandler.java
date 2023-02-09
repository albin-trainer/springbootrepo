package com.cg.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.cg.dto.ApiError;
@RestControllerAdvice
public class GlobalExceptionHandler {
	/*
@ExceptionHandler
 public String handle(Exception e) {
	 return "prod id not found";
 }
 */
	@ExceptionHandler
	public  ResponseEntity<ApiError> handle(Exception e) {
		ApiError error= new ApiError();
		error.setError(e.getMessage());
		ResponseEntity<ApiError> resEntity= new ResponseEntity<ApiError>(error, HttpStatus.NOT_FOUND);
		return resEntity;
	}
}
