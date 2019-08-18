package com.peak.irving.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peak.irving.server.delegate.GeoLocationServiceDelegate;
import com.peak.irving.server.delegate.ReserveServiceDelegate;
import com.peak.irving.server.geo.model.GeoLocationDto;
import com.peak.irving.server.model.ReserveDTO;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/peak/api")
public class PeakController {

	@Autowired
	ReserveServiceDelegate reserveServiceDelegate;
	
	@Autowired
	GeoLocationServiceDelegate geoLocationServiceDelegate;
	
	@PostMapping("/reserve")
	public ReserveDTO save(@RequestBody ReserveDTO request) {
		return reserveServiceDelegate.save(request);
	}
	
	@PostMapping("/ip/save")
	public GeoLocationDto save(@RequestBody String ip) {
		return geoLocationServiceDelegate.save(ip);		
	}
	
}
