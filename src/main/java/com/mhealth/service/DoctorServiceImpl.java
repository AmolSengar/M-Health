package com.mhealth.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhealth.dao.DoctorJPARepository;
import com.mhealth.exception.DoctorNotAvailableException;
import com.mhealth.model.Doctor;

/*
 * DoctorServiceImplementation implements all the methods of doctor service
 * 
 */

@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private DoctorJPARepository docrepo;

	@Override
	public List<Doctor> getAllDoctors() {
		return docrepo.findAll();
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) throws DoctorNotAvailableException {
		List<Doctor> doct = docrepo.getBySpeciality(speciality);
		return doct;
	}

}
