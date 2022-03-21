package com.mhealth.exception;

@SuppressWarnings("serial")
public class DuplicateDonorException extends Exception {
	
	@SuppressWarnings("unused")
	private String message;

	public DuplicateDonorException(String message) {
		this.message = message;
	}

	public DuplicateDonorException() {
	}
	
	

}
