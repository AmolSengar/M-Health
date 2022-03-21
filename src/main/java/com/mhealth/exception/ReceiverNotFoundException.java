package com.mhealth.exception;

@SuppressWarnings("serial")
public class ReceiverNotFoundException extends Exception{
	
	@SuppressWarnings("unused")
	private String message;

	public ReceiverNotFoundException(String message) {
		this.message = message;
	}
	
	public ReceiverNotFoundException() {
	}
	

}
