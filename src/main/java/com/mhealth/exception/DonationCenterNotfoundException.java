package com.mhealth.exception;

@SuppressWarnings("serial")
public class DonationCenterNotfoundException extends Exception {
	@SuppressWarnings("unused")
	private String message;

	public DonationCenterNotfoundException(String message) {
		super(message);
	}

	public DonationCenterNotfoundException() {
	}

}