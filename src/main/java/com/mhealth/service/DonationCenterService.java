package com.mhealth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mhealth.exception.DonationCenterNotfoundException;
import com.mhealth.model.DonationCenter;

@Service
public interface DonationCenterService {
	
	public List<DonationCenter> getAllDonationCenters();

	public List<DonationCenter> findDonationCenterByAvailablebloodgroup(String availablebloodgroup) throws DonationCenterNotfoundException ;

	public List<DonationCenter> findDonationCenterByRequiredbloodgroup(String requiredbloodgroup) throws DonationCenterNotfoundException ;

}
