package com.peak.irving.server.geo.service;


import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

import org.springframework.stereotype.Component;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import com.peak.irving.server.geo.model.GeoLocationDto;

@Component
public class GeoLocationService {

	    private DatabaseReader dbReader;
	     
	    public GeoLocationService() throws IOException {
	        File database = new File("C:\\GeoLite2-City.mmdb");
	        dbReader = new DatabaseReader.Builder(database).build();
	    }
	     
	    public GeoLocationDto getLocation(String ip) 
	      throws IOException, GeoIp2Exception {
	        InetAddress ipAddress = InetAddress.getByName(ip);
	        CityResponse response = dbReader.city(ipAddress);
	        String countryName = response.getCountry().getName();
	        String cityName = response.getCity().getName();
	        String latitude = 
	          response.getLocation().getLatitude().toString();
	        String longitude = 
	          response.getLocation().getLongitude().toString();
	        return new GeoLocationDto(ip, countryName, cityName, latitude, longitude);
	    }
	}