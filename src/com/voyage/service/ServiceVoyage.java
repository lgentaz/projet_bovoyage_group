package com.voyage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.voyage.daos.IDAOVoyage;
import com.voyage.entities.Voyage;

@Service("serviceVoyage")
public class ServiceVoyage implements IServiceVoyage {
	@Autowired
	@Qualifier("daoVoyage")
	private IDAOVoyage dao;
	
	@Override
	public void addVoyage(Voyage v) {		
		dao.addVoyage(v);
	}
}