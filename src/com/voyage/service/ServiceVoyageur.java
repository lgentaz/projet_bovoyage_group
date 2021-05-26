package com.voyage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.voyage.daos.IDAOVoyageur;
import com.voyage.entities.Voyageur;

@Service("serviceVoyageur")
public class ServiceVoyageur implements IServiceVoyageur {
	@Autowired
	@Qualifier("daoVoyageur")
	private IDAOVoyageur dao;
	
	@Override
	public void addVoyageur(Voyageur v) {		
		dao.addVoyageur(v);
	}
}