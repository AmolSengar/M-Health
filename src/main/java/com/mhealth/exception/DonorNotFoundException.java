package com.mhealth.exception;

@SuppressWarnings("serial")
public class DonorNotFoundException extends Exception {
	
	@SuppressWarnings("unused")
	private String message;

	public DonorNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	public DonorNotFoundException() {
	}
	

}
