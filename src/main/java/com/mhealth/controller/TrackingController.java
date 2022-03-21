package com.mhealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mhealth.model.Tracking;
import com.mhealth.service.TrackingService;

@RestController
@RequestMapping("/track")
public class TrackingController {

	@Autowired
	private TrackingService service;

	@SuppressWarnings({ "rawtypes", "unchecked" })

	// [GET] http://localhost:8085/mhealth/track/getAll
	@GetMapping("/getAll")
	public ResponseEntity<List<Tracking>> getAllData() {
		List<Tracking> track = service.getAllData();
		if (track.isEmpty()) {
			return new ResponseEntity("Sorry! Doctors not available!", HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<List<Tracking>>(track, HttpStatus.OK);
	}

}
