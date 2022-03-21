package com.mhealth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "donor")
public class Donor {

	@Id
	@GeneratedValue
	private int id;
	@NotBlank(message = "name is mandatory")
	private String name;
	private String contactno;
	private String bloodgroup;
	private String email;
	@NotBlank(message = "password is mandatory")
	private String password;

	public Donor() {
	}

	public Donor(int id, String name, String contactno, String bloodgroup, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.contactno = contactno;
		this.bloodgroup = bloodgroup;
		this.email = email;
		this.password = password;
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

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Donor [id=" + id + ", name=" + name + ", contactno=" + contactno + ", bloodgroup=" + bloodgroup
				+ ", email=" + email + ", password=" + password + "]";
	}

}
