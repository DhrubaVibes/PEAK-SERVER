package com.peak.irving.server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peak.irving.server.model.ReserveDTO;

@Component
public class ReserveDao extends BaseDao{

	
	public ReserveDTO save(ReserveDTO entity) {// TODO Auto-generated method stub
		return (ReserveDTO) super.save(entity);
	}
}
