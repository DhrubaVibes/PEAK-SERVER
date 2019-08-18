package com.peak.irving.server.service;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.peak.irving.server.dao.GeoDao;
import com.peak.irving.server.geo.model.GeoLocationDto;
import com.peak.irving.server.geo.service.GeoLocationService;
import com.peak.irving.server.model.IpDTO;

@Service
public class GeoLocService {

	@Autowired
	GeoDao geoDao;
	
	@Autowired
	GeoLocationService geoLocationService;
	
	public GeoLocationDto saveIp(String ip) {
	
		GeoLocationDto dto;
		dto = geoDao.findLastGeoByIp(ip);
		if(dto != null) {
			if(dto.getTimestamp().after(new Date(System.currentTimeMillis() - 300000))) {
				System.out.println("Possible refresh page");
				return null;
			}
		}
		
		try {
			dto = geoLocationService.getLocation(ip);
			if(dto != null) {
				return (GeoLocationDto) geoDao.save(dto);			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GeoIp2Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;		
	}
}
