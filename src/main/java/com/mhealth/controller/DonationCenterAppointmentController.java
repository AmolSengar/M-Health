package com.mhealth.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhealth.exception.NoDonationCenterNameFoundException;
import com.mhealth.model.DonationCenterAppointment;
import com.mhealth.service.DonationCenterAppointmentService;

@RestController
@RequestMapping("/donationCenterAppointment")
public class DonationCenterAppointmentController {
	@Autowired
	private DonationCenterAppointmentService service;

	// [GET]  http://localhost:8085/mhealth/donationCenterAppointment/findByName/LifeSaver Hospital
	@GetMapping("/findByName/{name}")
	public ResponseEntity<List<DonationCenterAppointment>> getAllAppointmentByName(@PathVariable("name") String name)
			throws NoDonationCenterNameFoundException {
		List<DonationCenterAppointment> appointment = service.findByName(name);
		if (appointment.isEmpty()) {
			throw new NoDonationCenterNameFoundException();
		}
		return new ResponseEntity<List<DonationCenterAppointment>>(appointment, HttpStatus.OK);
	}
}
