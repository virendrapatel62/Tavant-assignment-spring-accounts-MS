package com.feelfreetocode.assignment.controllers.controlleradvicers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ControllerAdvicer extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	ResponseEntity<Object> handleMethodArgumentNotValid(Exception ex, WebRequest request) {
		// TODO Auto-generated method stub
		System.err.println("ERORR......");
		return new ResponseEntity<Object>( "Error From Advicer ⚠️⚠️" , HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
