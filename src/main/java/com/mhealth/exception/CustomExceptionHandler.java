package com.mhealth.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandler.class);

	@ExceptionHandler(DoctorNotAvailableException.class)
	public ResponseEntity<Object> handleUnavailableDoctorExecption()
	{
		LOG.error("handleUnavailableDoctorExecption");
		return new ResponseEntity<Object>("Sorry the Doctor for this Specaility is not available at the moment.....",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(DonorNotFoundException.class)
	public ResponseEntity<Object> handleDonorNotFoundException()
	{
		LOG.error("handleDonorNotFoundException");
		return new ResponseEntity<Object>("Donor not available in the database! ",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(DuplicateDonorException.class)
	public ResponseEntity<Object> handleDuplicateDonorException()
	{
		LOG.error("handleDuplicateDonorException");
		return new ResponseEntity<Object>("Donor already exist in the database! ",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(DuplicateUserException.class)
	public ResponseEntity<Object> handleDuplicateUserException()
	{
		LOG.error("DuplicateUserException");
		return new ResponseEntity<Object>("User already exist in the database! ",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(DonationCenterNotfoundException.class)
	public ResponseEntity<Object> handleDonationCenterNotfoundException()
	{
		LOG.error("DonationCenterNotfoundException");
		return new ResponseEntity<Object>("No DonationCenter found for this type of Bloodgroup! ",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ReceiverNotFoundException.class)
	public ResponseEntity<Object> handleReceiverNotFoundException()
	{
		LOG.error("ReceiverNotFoundException");
		return new ResponseEntity<Object>("Receiver of this type of Bloodgroup, not available in the Database! ",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(DuplicateReceiverFoundException.class)
	public ResponseEntity<Object> handleDuplicateReceiverFoundException()
	{
		LOG.error("DuplicateReceiverFoundException");
		return new ResponseEntity<Object>("Receiver already exist in the database! ",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoDonationCenterNameFoundException.class)
	public ResponseEntity<Object> handleNoDonationCenterNameFoundException()
	{
		LOG.error("NoDonationCenterNameFoundException");
		return new ResponseEntity<Object>("No DonationCenter found for this Name! ",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoDoctorNameFoundException.class)
	public ResponseEntity<Object> handleNoDoctorNameFoundException()
	{
		LOG.error("NoDoctorNameFoundException");
		return new ResponseEntity<Object>("No Doctor found for this Name! ",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoNurseNameFoundException.class)
	public ResponseEntity<Object> handleNoNurseNameFoundException()
	{
		LOG.error("NoNurseNameFoundException");
		return new ResponseEntity<Object>("No Nurse found for this Name! ",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoNameFoundException.class)
	public ResponseEntity<Object> handleNoNameFoundException()
	{
		LOG.error("NoNameFoundException");
		return new ResponseEntity<Object>("No Recipient found for this Name!. Payment unsuccessful ",HttpStatus.BAD_REQUEST);
	}
	
}