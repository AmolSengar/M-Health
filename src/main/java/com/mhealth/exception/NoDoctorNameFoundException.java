package com.mhealth.exception;

@SuppressWarnings("serial")
public class NoDoctorNameFoundException extends Exception {
	
	@SuppressWarnings("unused")
	private String message;

	public NoDoctorNameFoundException(String message) {
		this.message = message;
	}

	public NoDoctorNameFoundException() {
	}

}
