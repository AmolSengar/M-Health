package com.mhealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhealth.exception.NoDoctorNameFoundException;
import com.mhealth.model.DoctorsAppointment;
import com.mhealth.service.DoctorsAppointmentService;

@RestController
@RequestMapping("/doctorAppointment")
public class DoctorsAppointmentController {

	@Autowired
	private DoctorsAppointmentService service;

	// [GET] http://localhost:8085/mhealth/doctorAppointment/findByName/Dr. Sharad Dixit
	@GetMapping("/findByName/{name}")
	public ResponseEntity<List<DoctorsAppointment>> getAllDoctorsAppointmentsByName(@PathVariable("name") String name)
			throws NoDoctorNameFoundException {
		List<DoctorsAppointment> doc = service.findByName(name);
		if (doc.isEmpty()) {
			throw new NoDoctorNameFoundException();
		}
		return new ResponseEntity<List<DoctorsAppointment>>(doc, HttpStatus.OK);
	}

}