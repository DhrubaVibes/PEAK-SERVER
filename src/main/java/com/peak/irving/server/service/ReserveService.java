package com.peak.irving.server.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peak.irving.server.dao.ReserveDao;
import com.peak.irving.server.model.ReserveDTO;

@Service
public class ReserveService {

	
	@Autowired
	private ReserveDao reserveDao;
	
	public ReserveService(){

	}
	
	public ReserveDTO save(ReserveDTO dto) {
		dto.setTimestamp(new Timestamp(System.currentTimeMillis()));
		return (ReserveDTO) reserveDao.save(dto);
	}

}
