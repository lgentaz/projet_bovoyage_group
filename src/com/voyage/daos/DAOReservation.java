package com.voyage.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;


import com.voyage.util.JpaUtil;
import com.voyage.entities.Reservation;

@Repository("daoReservation")
public class DAOReservation implements IDAOReservation {
	
	@Override
	public boolean addReservation() {

	    boolean success=false;

		try {
	    EntityManager em=JpaUtil.getEmf().createEntityManager();
		EntityTransaction tx =  em.getTransaction();
		tx.begin();		

		Reservation res = new Reservation();		

		em.persist(res);		

		tx.commit();

		em.close();

		success=true;
		}
		catch (Exception e) {
			e.printStackTrace();	
		}
		return success;
	}

}
