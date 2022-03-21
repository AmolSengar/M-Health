package com.mhealth.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mhealth.exception.DuplicateUserException;
import com.mhealth.model.User;
import com.mhealth.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;

	// [GET] http://localhost:8085/mhealth/user/getAllUsers
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping("/getAllUsers")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> users = service.getAllUsers();
		if (users.isEmpty()) {
			return new ResponseEntity("Sorry! Users not available!", HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	// [POST] http://localhost:8085/mhealth/user/profileCreation
	@PostMapping("/profileCreation")
	public ResponseEntity<List<User>> insertUser(@Valid @RequestBody User user) throws DuplicateUserException {
		List<User> existingUsers = service.getAllUsers();
		for (User u : existingUsers) {
			if (u.getUsername().equalsIgnoreCase(user.getUsername())) {
				throw new DuplicateUserException();
			}
		}
		List<User> users = service.saveUser(user);

		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	// [POST] http://localhost:8085/mhealth/user/login
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping("/login")
	public ResponseEntity<List<User>> findByUsernameAndPassword(@Valid @RequestBody User user) {
		ResponseEntity<List<User>> response = null;
		List<User> userlist = service.getAllUsers();
		for (User u : userlist) {
			if (u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {
				response = new ResponseEntity("Login Successful!!", HttpStatus.ACCEPTED);
			} else {
				response = new ResponseEntity("Invalid credentials. Please check details or SignUp!",
						HttpStatus.ACCEPTED);
			}
		}
		return response;
	}

}