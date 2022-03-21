package com.mhealth.exception;

@SuppressWarnings("serial")
public class DuplicateReceiverFoundException extends Exception {

	@SuppressWarnings("unused")
	private String message;

	public DuplicateReceiverFoundException(String message) {
		this.message = message;
	}
	
	public DuplicateReceiverFoundException() {
	}
	

}
