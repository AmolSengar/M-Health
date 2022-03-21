package com.mhealth.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mhealth.model.Receiver;

@Repository
public interface ReceiverJPARepository extends JpaRepository<Receiver, Integer> {

	public List<Receiver> getByBloodgroup(String bloodgroup);

	public String getByNameAndPassword(String name, String password);

}
