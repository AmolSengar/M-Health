package com.mhealth.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tracking")
public class Tracking {

	@Id
	private int tracking_id;
	private String donor_name;
	private String receiver_name;
	private String bloodgroup;

	public Tracking() {
	}

	public Tracking(int tracking_id, String donor_name, String receiver_name, String bloodgroup) {
		super();
		this.tracking_id = tracking_id;
		this.donor_name = donor_name;
		this.receiver_name = receiver_name;
		this.bloodgroup = bloodgroup;
	}

	public int getTracking_id() {
		return tracking_id;
	}

	public void setTracking_id(int tracking_id) {
		this.tracking_id = tracking_id;
	}

	public String getDonor_name() {
		return donor_name;
	}

	public void setDonor_name(String donor_name) {
		this.donor_name = donor_name;
	}

	public String getReceiver_name() {
		return receiver_name;
	}

	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	@Override
	public String toString() {
		return "Tracking [tracking_id=" + tracking_id + ", donor_name=" + donor_name + ", receiver_name="
				+ receiver_name + ", bloodgroup=" + bloodgroup + "]";
	}

	
}
