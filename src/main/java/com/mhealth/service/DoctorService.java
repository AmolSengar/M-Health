package com.mhealth.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.mhealth.exception.DoctorNotAvailableException;
import com.mhealth.model.Doctor;

/*
 * Service class for Doctor
 * 
 */
//@service tells the spring that this class contains the business logic 
@Service
public interface DoctorService {
	
	public List<Doctor> getAllDoctors();

	/*
	 * find method to find Doctor by its speciality
	 * 
	 * @param speciality - doctors speciality
	 * @returns doctors list with speciality 
	 * @throws DoctorNotAvailableException if doctor not found with the required speciality
	 */
	public List<Doctor> findBySpeciality(String speciality) throws DoctorNotAvailableException;
}