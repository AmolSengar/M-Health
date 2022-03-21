package com.mhealth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mhealth.model.User;

@Repository
public interface UserJPARepository extends JpaRepository<User, Integer>{

	String getByUsernameAndPassword(String username, String password);
	
}