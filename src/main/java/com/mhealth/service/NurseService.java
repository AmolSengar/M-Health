package com.mhealth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mhealth.model.Nurse;
@Service
public interface NurseService {
	public List<Nurse> getAllNurse();

}