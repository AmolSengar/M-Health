package com.mhealth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mhealth.exception.DonorNotFoundException;
import com.mhealth.exception.DuplicateDonorException;
import com.mhealth.model.Donor;

/*
 * Service class for Donor
 * 
 */

//@service tells the spring that class contains the business logic 
@Service
public interface DonorService {

	public List<Donor> getAllDonors();
	
	/*
	 * verify user if it exist in database or not
	 * 
	 * @param - name and password
	 * @returns- a message with results
	 */
	
	public String verifyDonor(String name,String password);

	public List<Donor> saveDonors(Donor donor) throws DuplicateDonorException;
	
	/*
	 * find method to find donor by its blood group
	 * 
	 * @param bloodgroup - donor's blood group
	 * @returns donor list after finding it by blood group 
	 * @throws DonorNotFoundException if donor not found with the required blood group
	 */

	public List<Donor> findBybloodgroup(String bloodgroup) throws DonorNotFoundException;

}