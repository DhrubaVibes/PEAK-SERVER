package com.peak.irving.server.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="IP")
public class IpDTO {

	@Id
	@GeneratedValue
	private Long id;
	
	private String ipAddress;
	
	private Timestamp timestamp;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "IpDTO [id=" + id + ", ipAddress=" + ipAddress + ", timestamp=" + timestamp + "]";
	}
	
	
	
}
