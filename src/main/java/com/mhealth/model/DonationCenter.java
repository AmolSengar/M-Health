package com.mhealth.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/*
 * Class DonationCenter is the entity representing donation_centers table in database
 */

@Entity
@Table(name = "donation_centers")
public class DonationCenter {

	// @Id sets id as the primary key
	@Id
	private String id;
	private String contactno;
	private String address;
	@NotBlank(message = "availablebloodgroup is mandatory")
	private String availablebloodgroup;
	@NotBlank(message = "requiredbloodgroup is mandatory")
	private String requiredbloodgroup;
	private Date st;
	private Date et;

	public DonationCenter() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAvailablebloodgroup() {
		return availablebloodgroup;
	}

	public void setAvailablebloodgroup(String availablebloodgroup) {
		this.availablebloodgroup = availablebloodgroup;
	}

	public String getRequiredbloodgroup() {
		return requiredbloodgroup;
	}

	public void setRequiredbloodgroup(String requiredbloodgroup) {
		this.requiredbloodgroup = requiredbloodgroup;
	}

	public Date getSt() {
		return st;
	}

	public void setSt(Date st) {
		this.st = st;
	}

	public Date getEt() {
		return et;
	}

	public void setEt(Date et) {
		this.et = et;
	}

	public DonationCenter(String id, String contactno, String address, String availablebloodgroup,
			String requiredbloodgroup, Date st, Date et) {
		this.id = id;
		this.contactno = contactno;
		this.address = address;
		this.availablebloodgroup = availablebloodgroup;
		this.requiredbloodgroup = requiredbloodgroup;
		this.st = st;
		this.et = et;
	}

	@Override
	public String toString() {
		return "DonationCenter [id=" + id + ", contactno=" + contactno + ", address=" + address
				+ ", availablebloodgroup=" + availablebloodgroup + ", requiredbloodgroup=" + requiredbloodgroup
				+ ", st=" + st + ", et=" + et + "]";
	}

}
