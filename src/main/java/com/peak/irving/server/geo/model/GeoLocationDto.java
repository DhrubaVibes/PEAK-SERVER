package com.peak.irving.server.geo.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GEO_LOCATION")
public class GeoLocationDto {
	@Id
	@GeneratedValue
	private Long id;
    private String ipAddress;
    private String city;
    private String country;
    private String latitude;
    private String longitude;
    private Timestamp timestamp;
    
    
    
	public GeoLocationDto() {
		super();
	}


	public GeoLocationDto(String ip, String countryName, String cityName, String latitude2, String longitude2) {
		this.setIpAddress(ip);
		this.setCountry(countryName);
		this.setCity(cityName);
		this.setLatitude(latitude2);
		this.setLongitude(longitude2);
		this.timestamp = new Timestamp(System.currentTimeMillis());
	}

	
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public Timestamp getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
	

}
