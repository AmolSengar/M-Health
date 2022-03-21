package com.mhealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhealth.exception.DoctorNotAvailableException;
import com.mhealth.model.Doctor;
import com.mhealth.service.DoctorService;

//@RestController is combination of @Controller and @ResponseBody
//@Controller marks a class as a web request handler
//@ResponseBody binds Http request with an object in a method parameter
//@RequestMapping map client request with a appropriate method
//@PathVariable extract the value from the URL
//@ResponseEntity Allows you to modify the response with optional headers ans status codes

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	// connecting the database with doctor service class
	@Autowired
	private DoctorService service;

	// requests the controller to get the list of all the doctors
	@SuppressWarnings({ "rawtypes", "unchecked" })

	// [GET] http://localhost:8085/mhealth/doctor/getAllDoctors
	@GetMapping("/getAllDoctors")
	public ResponseEntity<List<Doctor>> getAllDoctors() {
		List<Doctor> doctors = service.getAllDoctors();
		if (doctors.isEmpty()) {
			return new ResponseEntity("Sorry! Doctors not available!", HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<List<Doctor>>(doctors, HttpStatus.OK);
	}

	// requests the controller to get the list of all the doctors with speciality

	// [GET] http://localhost:8085/mhealth/doctor/doctorSpeciality/Fever
	@GetMapping("/doctorSpeciality/{speciality}")
	public ResponseEntity<List<Doctor>> getAllDoctorsBySpecialist(@PathVariable("speciality") String speciality)
			throws DoctorNotAvailableException {

		List<Doctor> doct = service.findBySpeciality(speciality);

		if (doct.isEmpty()) {
			throw new DoctorNotAvailableException();
		}

		return new ResponseEntity<List<Doctor>>(doct, HttpStatus.OK);
	}

}