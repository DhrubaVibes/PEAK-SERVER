package com.peak.irving.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.peak.irving.server.geo.model.GeoLocationDto;

public interface GeoRepo extends JpaRepository<GeoLocationDto, Long> {

	@Query(value = "SELECT * FROM GEO_LOCATION where ip_address = :ip and id = ( select max(id) FROM GEO_LOCATION where ip_address = :ip )", nativeQuery = true)
	public GeoLocationDto findLatestGeoByIp(@Param("ip") String ip);
}
