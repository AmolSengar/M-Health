package com.mhealth.exception;

@SuppressWarnings("serial")
public class NoNameFoundException extends Exception {

	@SuppressWarnings("unused")
	private String message;

	public NoNameFoundException(String message) {
		this.message = message;
	}

	public NoNameFoundException() {
	}

}
