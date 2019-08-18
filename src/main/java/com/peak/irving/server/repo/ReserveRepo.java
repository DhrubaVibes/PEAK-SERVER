package com.peak.irving.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peak.irving.server.model.ReserveDTO;

@Repository
public interface ReserveRepo extends JpaRepository<ReserveDTO, Long> {

	
	
}
