package com.mhealth.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhealth.dao.DonationCenterJPARepository;
import com.mhealth.exception.DonationCenterNotfoundException;
import com.mhealth.model.DonationCenter;

@Service
public class DonationCenterServiceImpl implements DonationCenterService {
	@Autowired
	private DonationCenterJPARepository donRepo;

	@Override
	public List<DonationCenter> getAllDonationCenters() {
		return donRepo.findAll();
	}

	@Override
	public List<DonationCenter> findDonationCenterByAvailablebloodgroup(String availablebloodgroup) throws DonationCenterNotfoundException {
		List<DonationCenter> center = donRepo.getByAvailablebloodgroup(availablebloodgroup); 
		return center;
	}

	@Override
	public List<DonationCenter> findDonationCenterByRequiredbloodgroup(String requiredbloodgroup) throws DonationCenterNotfoundException {
		List<DonationCenter> center = donRepo.getByRequiredbloodgroup(requiredbloodgroup); 
		return center;
	}
}
