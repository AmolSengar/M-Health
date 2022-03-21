package com.mhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhealth.dao.NurseJPARepository;
import com.mhealth.model.Nurse;

@Service
public class NurseServiceImpl implements NurseService {
	@Autowired
	private NurseJPARepository nurRepo;

	@Override
	public List<Nurse> getAllNurse() {
		return nurRepo.findAll();
	}
}
