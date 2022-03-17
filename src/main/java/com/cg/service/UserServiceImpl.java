package com.cg.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.DoctorJPARepository;
import com.cg.model.Doctor;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private DoctorJPARepository docRepo;

	@Override
	public List<Doctor> getAllDoctors() {

		return docRepo.findAll();
	}

}
