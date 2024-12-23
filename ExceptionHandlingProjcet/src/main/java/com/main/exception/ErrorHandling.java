package com.main.exception;

public class ErrorHandling extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public ErrorHandling(String message) {
		super(message);
	}
	
	public ErrorHandling() {
		
	}

}
