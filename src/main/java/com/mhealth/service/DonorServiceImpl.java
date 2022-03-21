package com.mhealth.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhealth.dao.DonorJPARepository;
import com.mhealth.exception.DonorNotFoundException;
import com.mhealth.exception.DuplicateDonorException;
import com.mhealth.model.Donor;

/*
 * DonorServiceImplementation implements all the methods of donor service
 * 
 */

@Service
public class DonorServiceImpl implements DonorService {

	// connecting the service implementation with the DonorJPARepository
	@Autowired
	public DonorJPARepository donRepo;

	@Override
	public List<Donor> getAllDonors() {
		return donRepo.findAll();
	}

	/*
	 * method for saving new donors
	 */
	@Override
	public List<Donor> saveDonors(Donor donor) throws DuplicateDonorException {
		donRepo.saveAndFlush(donor);
		return donRepo.findAll();
	}

	/*
	 * method to find donor by bloodgroup
	 */
	@Override
	public List<Donor> findBybloodgroup(String bloodgroup) throws DonorNotFoundException {
		return donRepo.getBybloodgroup(bloodgroup);
	}

	/*
	 * method for verifying donors
	 */
	@Override
	public String verifyDonor(String name, String password) {
		return donRepo.getByNameAndPassword(name,password);
	}

}
