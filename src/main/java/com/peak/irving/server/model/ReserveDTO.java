package com.peak.irving.server.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESERVE")
public class ReserveDTO {
	
	@Id
	@GeneratedValue
	private Long reserveId;
	
	private String fullName;
	
	private Date reserve;
	
	private String email;
	
	private String phone;
	
	private int numOfPeople;

	private Timestamp timestamp;
	
	public Long getReserveId() {
		return reserveId;
	}

	public void setReserveId(Long reserveId) {
		this.reserveId = reserveId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getReserve() {
		return reserve;
	}

	public void setReserve(Date reserve) {
		this.reserve = reserve;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getNumOfPeople() {
		return numOfPeople;
	}

	public void setNumOfPeople(int numOfPeople) {
		this.numOfPeople = numOfPeople;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "ReserveDTO [reserveId=" + reserveId + ", fullName=" + fullName + ", reserve=" + reserve + ", email="
				+ email + ", phone=" + phone + ", numOfPeople=" + numOfPeople + ", timestamp=" + timestamp + "]";
	}


	
	
}
