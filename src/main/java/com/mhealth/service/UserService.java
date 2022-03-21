package com.mhealth.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.mhealth.exception.DuplicateUserException;
import com.mhealth.model.User;

@Service
public interface UserService {
	
	public List<User> getAllUsers();

	public String verifyUser(String username, String password);

	public List<User> saveUser(User user) throws DuplicateUserException;
}
