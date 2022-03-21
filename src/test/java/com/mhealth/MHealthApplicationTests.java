package com.mhealth;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.mhealth.dao.DoctorJPARepository;
import com.mhealth.dao.DoctorsAppointmentJPARepository;
import com.mhealth.dao.DonationCenterAppointmentJPARepository;
import com.mhealth.dao.DonationCenterJPARepository;
import com.mhealth.dao.DonorJPARepository;
import com.mhealth.dao.NurseAppointmentJPARepository;
import com.mhealth.dao.NurseJPARepository;
import com.mhealth.dao.ReceiverJPARepository;
import com.mhealth.dao.UserJPARepository;
import com.mhealth.model.Doctor;
import com.mhealth.model.DoctorsAppointment;
import com.mhealth.model.DonationCenter;
import com.mhealth.model.DonationCenterAppointment;
import com.mhealth.model.Donor;
import com.mhealth.model.Nurse;
import com.mhealth.model.NurseAppointment;
import com.mhealth.model.Receiver;
import com.mhealth.model.User;

@SpringBootTest(classes = MHealthApplication.class)
class MHealthApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	UserJPARepository userRepository;

	@Autowired
	DoctorJPARepository doctorRepository;

	@Autowired
	DonationCenterJPARepository donationCenterRepository;

	@Autowired
	DonorJPARepository donorRepository;

	@Autowired
	NurseJPARepository nurseRepository;

	@Autowired
	ReceiverJPARepository receiverRepository;

	@Autowired
	DoctorsAppointmentJPARepository doctorAppointmentRepository;

	@Autowired
	NurseAppointmentJPARepository nurseAppointmentRepository;

	@Autowired
	DonationCenterAppointmentJPARepository donationCenterAppointmentRepository;

	@Test
	public void testViewUsers() {
		List<User> list = userRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void testViewDoctors() {
		List<Doctor> list = doctorRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void testFindDoctorBySpeciality() {
		@SuppressWarnings("unused")
		Doctor doctor = doctorRepository.getBySpeciality("Fever").get(0);
		assertNotEquals("fever", doctorRepository.getBySpeciality("Fever").get(0));
	}

	@Test
	public void testViewDonationCenter() {
		List<DonationCenter> list = donationCenterRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void testFindDonationCenterByBloodgroup() {
		@SuppressWarnings("unused")
		DonationCenter donationCenter = donationCenterRepository.getByAvailablebloodgroup("O+").get(0);
		assertNotEquals("OA+", donationCenterRepository.getByAvailablebloodgroup("O+").get(0));
	}

	@Test
	public void testViewDonor() {
		List<Donor> list = donorRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void testFindDonorByBloodgroup() {
		@SuppressWarnings("unused")
		Donor donor = donorRepository.getBybloodgroup("O+").get(0);
		assertNotEquals("A-", donorRepository.getBybloodgroup("O+").get(0));
	}

	@Test
	public void testViewNurse() {
		List<Nurse> list = nurseRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void testViewReceiver() {
		List<Receiver> list = receiverRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@SuppressWarnings("unused")
	@Test
	public void testFindReceiverByBloodgroup() {
		Receiver receiver = receiverRepository.getByBloodgroup("O+").get(0);
		assertNotEquals("O-", receiverRepository.getByBloodgroup("O+").get(0));
	}

	@Test
	public void testFindDoctorAppointmentByName() {
		@SuppressWarnings("unused")
		DoctorsAppointment appointment = doctorAppointmentRepository.getByName("Dr. Rajeev Verma").get(0);
		assertNotEquals(" Rajeev ", doctorAppointmentRepository.getByName("Dr. Rajeev Verma").get(0));
	}

	@Test
	public void testFindNurseAppointmentByName() {
		@SuppressWarnings("unused")
		NurseAppointment appointment = nurseAppointmentRepository.getByName("Suhani Shukla").get(0);
		assertNotEquals(" suhani  ", nurseAppointmentRepository.getByName("Suhani Shukla").get(0));
	}

	@Test
	public void testFindDonationCenterAppointmentByName() {
		@SuppressWarnings("unused")
		DonationCenterAppointment appointment = donationCenterAppointmentRepository.getByName("SAFE Hospital").get(0);
		assertNotEquals(" abc Hospital ", donationCenterAppointmentRepository.getByName("SAFE Hospital").get(0));
	}

}
