package com.example.demo.exception;

public class BookNotReturnedException extends RuntimeException {
	/**
	 * Books not returned exception raises when books are not returned on time or renewal on time
	 */
	private static final long serialVersionUID = -8779852046026852851L;
	public String message;
	public BookNotReturnedException(String msg) 
	{
		super(msg);
		this.message=msg;
	}

}
