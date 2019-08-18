package com.peak.irving.server.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peak.irving.server.model.ReserveDTO;
import com.peak.irving.server.service.ReserveService;

@Component
public class ReserveServiceDelegate {

	@Autowired
	ReserveService reserveService;
	
	public ReserveDTO save(ReserveDTO dto) {
		return reserveService.save(dto);
	}
}
