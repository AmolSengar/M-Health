package com.cg.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.cg.model.Doctor;

@Service
public interface UserService {
	
	public List<Doctor> getAllDoctors();

}