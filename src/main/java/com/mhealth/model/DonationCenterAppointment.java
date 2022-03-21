package com.mhealth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "donationcenter_appointment")
public class DonationCenterAppointment {

	@Id
	@GeneratedValue
	private int id;
	@NotBlank(message = "name is mandatory")
	private String name;
	private String appointment;
	private String status;

	public DonationCenterAppointment() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAppointment() {
		return appointment;
	}

	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public DonationCenterAppointment(int id, String name, String appointment, String status) {
		super();
		this.id = id;
		this.name = name;
		this.appointment = appointment;
		this.status = status;
	}

	@Override
	public String toString() {
		return "DonationCenterAppointment [id=" + id + ", name=" + name + ", appointment=" + appointment + ", status="
				+ status + "]";
	}

}
