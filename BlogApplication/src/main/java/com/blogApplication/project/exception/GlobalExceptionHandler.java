package com.blogApplication.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.blogApplication.project.response.Response;

@RestControllerAdvice
public class GlobalExceptionHandler {
  
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Response>resourceNotFoundException(ResourceNotFoundException ex){
		String messgae= ex.getMessage();
		Response response = new Response("messgae", false);
		return new ResponseEntity<Response>(response,HttpStatus.NOT_FOUND);
		
	}
}
