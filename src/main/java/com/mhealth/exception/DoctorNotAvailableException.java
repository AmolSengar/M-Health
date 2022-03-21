package com.mhealth.exception;

@SuppressWarnings("serial")
public class DoctorNotAvailableException extends Exception {
	@SuppressWarnings("unused")
	private String message;

	public DoctorNotAvailableException(String message) {
		super(message);
	}

	public DoctorNotAvailableException() {
	}
	
}
