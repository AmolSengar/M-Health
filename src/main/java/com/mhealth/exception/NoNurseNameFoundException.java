package com.mhealth.exception;

@SuppressWarnings("serial")
public class NoNurseNameFoundException extends Exception {
	@SuppressWarnings("unused")
	private String message;

	public NoNurseNameFoundException(String message) {
		this.message = message;
	}

	public NoNurseNameFoundException() {
	}

}
