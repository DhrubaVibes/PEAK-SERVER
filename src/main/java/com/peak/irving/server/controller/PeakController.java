package com.peak.irving.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerInterceptor;

import com.peak.irving.server.delegate.GeoLocationServiceDelegate;
import com.peak.irving.server.delegate.ReserveServiceDelegate;
import com.peak.irving.server.geo.model.GeoLocationDto;
import com.peak.irving.server.model.ReserveDTO;

import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Tags;

@RestController
@RequestMapping("/peak/api")
public class PeakController implements HandlerInterceptor{

	public PeakController() {	
	}
	
	@Autowired
	ReserveServiceDelegate reserveServiceDelegate;
	
	@Autowired
	GeoLocationServiceDelegate geoLocationServiceDelegate;
	
	@PostMapping("/reserve")
	public ReserveDTO save(@RequestBody ReserveDTO request) {
		ReserveDTO dto =  reserveServiceDelegate.save(request);
		
		return dto;
	}
	
	@PostMapping("/ip/save")
	public GeoLocationDto save(@RequestBody String ip) {
		GeoLocationDto dto = geoLocationServiceDelegate.save(ip);	
		if(dto != null) {
			String city = "n/a";
			if(dto.getCity() != null) {
				city = dto.getCity();
			} 
			Metrics.counter("custom.metrics.counter.visitors", Tags.of("city", city)).increment();			
		}

		return dto;
	}
	
}
