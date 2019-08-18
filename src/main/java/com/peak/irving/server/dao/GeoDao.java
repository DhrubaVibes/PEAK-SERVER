package com.peak.irving.server.dao;

import org.springframework.stereotype.Component;

import com.peak.irving.server.geo.model.GeoLocationDto;
import com.peak.irving.server.model.IpDTO;

@Component
public class GeoDao extends BaseDao {


	public GeoLocationDto save(IpDTO entity) {
		return (GeoLocationDto) super.save(entity);
	}
	
	public GeoLocationDto findLastGeoByIp(String ip) {
		return geoRepo.findLatestGeoByIp(ip);
	}
	

}
