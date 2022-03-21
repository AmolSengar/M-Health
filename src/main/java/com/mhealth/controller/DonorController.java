package com.mhealth.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhealth.exception.DonorNotFoundException;
import com.mhealth.exception.DuplicateDonorException;
import com.mhealth.model.Donor;
import com.mhealth.service.DonorService;

@RestController
@RequestMapping("/donor")
public class DonorController {

	@Autowired
	private DonorService service;

	@SuppressWarnings({ "unchecked", "rawtypes" })

	// [GET] http://localhost:8085/mhealth/donor/getALLDonors
	@GetMapping("/getALLDonors")
	public ResponseEntity<List<Donor>> getAllDonors() {
		List<Donor> donors = service.getAllDonors();
		if (donors.isEmpty()) {
			return new ResponseEntity("Sorry! Donors not available!", HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<List<Donor>>(donors, HttpStatus.OK);
	}

	// [POST] http://localhost:8085/mhealth/donor/profileCreation
	@PostMapping("/profileCreation")
	public ResponseEntity<List<Donor>> insertDonors(@Valid @RequestBody Donor donor) throws DuplicateDonorException {
		List<Donor> existingDonors = service.getAllDonors();
		for (Donor d : existingDonors) {
			if (d.getName().equalsIgnoreCase(donor.getName())) {
				throw new DuplicateDonorException();
			}
		}
		List<Donor> donors = service.saveDonors(donor);

		return new ResponseEntity<List<Donor>>(donors, HttpStatus.OK);
	}

	// [POST] http://localhost:8085/mhealth/donor/login
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping("/login")
	public ResponseEntity<List<Donor>> findByNameAndPassword(@Valid @RequestBody Donor donor) {
		ResponseEntity<List<Donor>> response = null;
		List<Donor> donorlist = service.getAllDonors();
		for (Donor d : donorlist) {
			if (d.getName().equals(donor.getName()) && d.getPassword().equals(donor.getPassword())) {
				response = new ResponseEntity("Login Successful!!", HttpStatus.ACCEPTED);
			} else {
				response = new ResponseEntity("Invalid credentials. Please check details or SignUp!",
						HttpStatus.NOT_ACCEPTABLE);
			}
		}
		return response;
	}

	// [GET] http://localhost:8085/mhealth/donor/getDonorByBloodgroup/A+
	@GetMapping("/getDonorByBloodgroup/{bloodgroup}")
	public ResponseEntity<List<Donor>> findBybloodgroup(@PathVariable("bloodgroup") String bloodgroup)
			throws DonorNotFoundException {

		List<Donor> donors = service.findBybloodgroup(bloodgroup);

		if (donors.isEmpty()) {
			throw new DonorNotFoundException();
		}

		return new ResponseEntity<List<Donor>>(donors, HttpStatus.OK);
	}

}
