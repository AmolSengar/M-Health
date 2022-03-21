package com.mhealth.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mhealth.model.DonationCenterAppointment;
@Repository
public interface DonationCenterAppointmentJPARepository extends JpaRepository<DonationCenterAppointment, Integer>{

	public List<DonationCenterAppointment> getByName(String name);

	
}