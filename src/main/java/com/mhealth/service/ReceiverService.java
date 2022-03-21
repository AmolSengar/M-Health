package com.mhealth.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.mhealth.exception.DuplicateReceiverFoundException;
import com.mhealth.exception.ReceiverNotFoundException;
import com.mhealth.model.Receiver;

/*
 * Service class for Receiver
 * 
 */

//@service tells the spring that class contains the business logic 
@Service
public interface ReceiverService {
	
	public List<Receiver> getAllReceivers();
	
	public String verifyReceiver(String name,String password);
	
	/*
	 * save method for saving receiver's data
	 * 
	 * @param receiver 	receiver object
	 * @return returns list of receiver after saving 
	 * @throws DuplicateReceiverFoundException if receiver already exist in the database throws exception
	 */
	
	public List<Receiver> saveReceiver(Receiver receiver) throws DuplicateReceiverFoundException;
	
	/*
	 * find method to find receiver by its blood group
	 * 
	 * @param bloodgroup - receiver's blood group
	 * @returns receiver after finding it by blood group 
	 * @throws ReceiverNotFoundException if receiver not found with the required blood group
	 */
		
	public List<Receiver> findReceiverByBloodGroup(String bloodgroup) throws ReceiverNotFoundException;

}
