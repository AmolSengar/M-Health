package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Doctor;
import com.cg.service.UserService;

@RestController
@RequestMapping("/ap/v1")
public class DoctorController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/doctor/getdoctors")
	public ResponseEntity<List<Doctor>> getAllDoctors() {
		List<Doctor> doctors = service.getAllDoctors();
		if(doctors.isEmpty()) {
			return new ResponseEntity("Sorry! Doctors not available!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Doctor>>(doctors, HttpStatus.OK);
	}
	

}
