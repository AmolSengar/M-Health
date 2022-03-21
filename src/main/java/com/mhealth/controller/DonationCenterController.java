package com.mhealth.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhealth.exception.DonationCenterNotfoundException;
import com.mhealth.model.DonationCenter;
import com.mhealth.service.DonationCenterService;

@RestController
@RequestMapping("/donationCenter")
public class DonationCenterController {

	@Autowired
	private DonationCenterService service;

	@SuppressWarnings({ "unchecked", "rawtypes" })

	// [GET] http://localhost:8085/mhealth/donationCenter/getAllCenters
	@GetMapping("/getAllCenters")
	public ResponseEntity<List<DonationCenter>> getAllDonationCenters() {
		List<DonationCenter> centers = service.getAllDonationCenters();
		if (centers.isEmpty()) {
			return new ResponseEntity("Sorry! DonationCenters not available!", HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<List<DonationCenter>>(centers, HttpStatus.OK);
	}

	// [GET] http://localhost:8085/mhealth/donationCenter/availableBloodgroup/AB+
	@GetMapping("/availableBloodgroup/{availablebloodgroup}")
	public ResponseEntity<List<DonationCenter>> findDonationCenterByAvailablebloodgroup(
			@PathVariable("availablebloodgroup") String availablebloodgroup) throws DonationCenterNotfoundException {

		List<DonationCenter> center = service.findDonationCenterByAvailablebloodgroup(availablebloodgroup);
		if (center.isEmpty()) {
			throw new DonationCenterNotfoundException();
		}

		return new ResponseEntity<List<DonationCenter>>(center, HttpStatus.OK);
	}

	//  [GET]	http://localhost:8085/mhealth/donationCenter/requiredBloodgroup/B+
	@GetMapping("/requiredBloodgroup/{requiredbloodgroup}")
	public ResponseEntity<List<DonationCenter>> findDonationCenterByRequiredbloodgroup(
			@PathVariable("requiredbloodgroup") String requiredbloodgroup) throws DonationCenterNotfoundException {
		List<DonationCenter> center = service.findDonationCenterByRequiredbloodgroup(requiredbloodgroup);
		if (center.isEmpty()) {
			throw new DonationCenterNotfoundException();
		}

		return new ResponseEntity<List<DonationCenter>>(center, HttpStatus.OK);
	}

}