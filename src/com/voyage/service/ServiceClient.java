package com.voyage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.voyage.daos.IDAOClient;
import com.voyage.entities.Client;

@Service("serviceClient")
public class ServiceClient implements IServiceClient {
	@Autowired
	@Qualifier("daoClient")
	private IDAOClient dao;
	
	@Override
	public void addClient(Client c) {		
		dao.addClient(c);
	}
}
