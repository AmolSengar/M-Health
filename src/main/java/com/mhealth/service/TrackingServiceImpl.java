package com.mhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhealth.dao.TrackingJPARepository;
import com.mhealth.model.Tracking;

@Service
public class TrackingServiceImpl implements TrackingService {
	
	@Autowired
	private TrackingJPARepository trackRepo;

	@Override
	public List<Tracking> getAllData() {
		return trackRepo.findAll();
	}

}
