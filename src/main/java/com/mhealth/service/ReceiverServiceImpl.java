package com.mhealth.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhealth.dao.ReceiverJPARepository;
import com.mhealth.exception.DuplicateReceiverFoundException;
import com.mhealth.exception.ReceiverNotFoundException;
import com.mhealth.model.Receiver;
/*
 * ReceiverServiceImplementation implements all the methods of receiver service
 * 
 */
@Service
public class ReceiverServiceImpl implements ReceiverService {
	
	// connecting the service implementation with the ReceiverJPARepository
	@Autowired
	private ReceiverJPARepository recRepo;

	@Override
	public List<Receiver> getAllReceivers() {
		return recRepo.findAll();
	}

	@Override
	public List<Receiver> saveReceiver(Receiver receiver) throws DuplicateReceiverFoundException {
		recRepo.saveAndFlush(receiver);
		return recRepo.findAll() ;
	}

	/*
	 * method to find receiver by bloodgroup
	 */
	
	@Override
	public List<Receiver> findReceiverByBloodGroup(String bloodgroup) throws ReceiverNotFoundException {
		List<Receiver> rec = recRepo.getByBloodgroup(bloodgroup);
		return rec;
	}

	/*
	 * method for login
	 */
	@Override
	public String verifyReceiver(String name, String password) {
		return recRepo.getByNameAndPassword(name,password);
	}

}
