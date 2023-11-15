package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class NotAvailableExceptionHandler {
	
	@ExceptionHandler(BookNotAvailableException.class)
	public ResponseEntity<?> handleNotAvailableException(
		BookNotAvailableException e){
		BookNotAvailableException customException_msg=new BookNotAvailableException("Books are not available.from handleException");
		return new ResponseEntity<>(customException_msg,HttpStatus.BAD_REQUEST);
		
	}

}
