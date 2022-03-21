package com.mhealth.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/*
 * Class DoctorsAppointment is the entity representing doctor_appointment table in database
 */
@Entity
@Table(name = "doctor_appointment")
public class DoctorsAppointment {

	// @Id sets id as the primary key
	@Id
	private int id;
	@NotBlank(message = "name is mandatory")
	private String name;
	private String appointment;
	private String status;

	public DoctorsAppointment() {
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

	public DoctorsAppointment(int id, String name, String appointment, String status) {
		this.id = id;
		this.name = name;
		this.appointment = appointment;
		this.status = status;
	}

	@Override
	public String toString() {
		return "DoctorAppointment [id=" + id + ", name=" + name + ", appointment=" + appointment + ", status=" + status
				+ "]";
	}

}
