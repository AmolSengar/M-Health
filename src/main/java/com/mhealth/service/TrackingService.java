package com.mhealth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mhealth.model.Tracking;

@Service
public interface TrackingService {
	
	public List<Tracking> getAllData();

}
