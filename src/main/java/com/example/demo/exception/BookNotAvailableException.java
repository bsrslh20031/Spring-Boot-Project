package com.example.demo.exception;

public class BookNotAvailableException extends RuntimeException {
	/**
	 * Books are not available exception is created to check whether books are available or not
	 */
	private static final long serialVersionUID = 1L;
	public String message;
	public BookNotAvailableException(String msg) 
	{
		super(msg);
		this.message=msg;
	}

}
