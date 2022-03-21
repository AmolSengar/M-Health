package com.mhealth.exception;

@SuppressWarnings("serial")
public class DuplicateUserException extends Exception {
	
	@SuppressWarnings("unused")
	private String message;

	public DuplicateUserException(String message) {
		this.message = message;
	}

	public DuplicateUserException() {
	}
	
	

}
