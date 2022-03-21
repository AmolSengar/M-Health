package com.mhealth.exception;

@SuppressWarnings("serial")
public class NoDonationCenterNameFoundException extends Exception  {
	
	@SuppressWarnings("unused")
	private String message;

	public NoDonationCenterNameFoundException(String message) {
		this.message = message;
	}

	public NoDonationCenterNameFoundException() {
	} 
	
	

}
