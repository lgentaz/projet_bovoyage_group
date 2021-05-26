package com.voyage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.voyage.daos.IDAOReservation;
import com.voyage.entities.Reservation;

@Service("serviceReservation")
public class ServiceReservation implements IServiceReservation {
	@Autowired
	@Qualifier("daoReservation")
	private IDAOReservation dao;
	
	@Override
	public void addReservation(Reservation resa) {		
		dao.addReservation(resa);
	}
}
