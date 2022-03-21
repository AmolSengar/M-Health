package com.mhealth.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhealth.exception.NoNurseNameFoundException;
import com.mhealth.model.NurseAppointment;
import com.mhealth.service.NurseAppointmentService;

@RestController
@RequestMapping("/nurseAppointment")
public class NurseAppointmentController {
	@Autowired
	private NurseAppointmentService service;

	// [GET] http://localhost:8085/mhealth/doctorAppointment/findByName/Mala Devi
	@GetMapping("/findByName/{name}")
	public ResponseEntity<List<NurseAppointment>> getAllNurseAppointmentByName(@PathVariable("name") String name)
			throws NoNurseNameFoundException {
		List<NurseAppointment> appointment = service.findByName(name);
		if (appointment.isEmpty()) {
			throw new NoNurseNameFoundException();
		}
		return new ResponseEntity<List<NurseAppointment>>(appointment, HttpStatus.OK);
	}
}