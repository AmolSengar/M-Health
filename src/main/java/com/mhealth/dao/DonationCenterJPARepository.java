package com.mhealth.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mhealth.model.DonationCenter;

@Repository
public interface DonationCenterJPARepository extends JpaRepository<DonationCenter, Integer> {

//	public List<DonationCenter> getByAddress(String address);

	public List<DonationCenter> getByAvailablebloodgroup(String availablebloodgroup);

	public List<DonationCenter> getByRequiredbloodgroup(String requiredbloodgroup);

}
