package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class NotReturnedExceptionHandler {

	@ExceptionHandler(BookNotReturnedException.class)
	public ResponseEntity<?> handleNotReturnedException(BookNotReturnedException e){
		BookNotReturnedException customException_msg1 =new BookNotReturnedException("Books are not returned on time.from handle Exception");
		return new ResponseEntity<>(customException_msg1,HttpStatus.BAD_REQUEST);
	}

}

