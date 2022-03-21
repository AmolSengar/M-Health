package com.mhealth.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhealth.dao.UserJPARepository;
import com.mhealth.exception.DuplicateUserException;
import com.mhealth.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserJPARepository useRepo;

	@Override
	public List<User> getAllUsers() {
		return useRepo.findAll();
	}

	@Override
	public List<User> saveUser(User user) throws DuplicateUserException {
		useRepo.saveAndFlush(user);
		return useRepo.findAll();
	}

	@Override
	public String verifyUser(String username, String password) {
		return useRepo.getByUsernameAndPassword(username,password);
	}

}