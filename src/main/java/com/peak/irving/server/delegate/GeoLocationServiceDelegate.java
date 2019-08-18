package com.peak.irving.server.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peak.irving.server.geo.model.GeoLocationDto;
import com.peak.irving.server.service.GeoLocService;

@Component
public class GeoLocationServiceDelegate {

	@Autowired
	GeoLocService geoLocService;

	
	public GeoLocationDto save(String ip) {
		return geoLocService.saveIp(ip);
	}
}
