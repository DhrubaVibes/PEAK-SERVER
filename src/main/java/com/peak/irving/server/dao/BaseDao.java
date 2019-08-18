package com.peak.irving.server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peak.irving.server.geo.model.GeoLocationDto;
import com.peak.irving.server.model.IpDTO;
import com.peak.irving.server.model.ReserveDTO;
import com.peak.irving.server.repo.GeoRepo;
import com.peak.irving.server.repo.ReserveRepo;

@Service
public class BaseDao {

	@Autowired 
	GeoRepo geoRepo;
	
	@Autowired
	ReserveRepo reserveRepo;
	

	public <T> Object save(T entity) {

		if (entity instanceof ReserveDTO) {
			ReserveDTO dto = (ReserveDTO) entity;
			return reserveRepo.save(dto);
		} else if(entity instanceof GeoLocationDto) {
			GeoLocationDto geoLocationDto = (GeoLocationDto) entity;
			return geoRepo.save(geoLocationDto);
		}

		return null;

	}

}
