package com.voyage.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;

import com.voyage.entities.Client;
import com.voyage.util.JpaUtil;

@Repository("daoClient")
public class DAOClient implements IDAOClient{
	@Override
	public boolean addClient(Client c) {

	    boolean success=false;

		try {
	    EntityManager em=JpaUtil.getEmf().createEntityManager();
		EntityTransaction tx =  em.getTransaction();
		tx.begin();		

		//Reservation res = new Reservation();		

		//em.persist(res);
		em.persist(c);

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
