package com.voyage.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;

import com.voyage.entities.Adresse;
import com.voyage.util.JpaUtil;

@Repository("daoAdresse")
public class DAOAdresse implements IDAOAdresse{
	@Override
	public boolean addAdresse(Adresse a) {

	    boolean success=false;

		try {
	    EntityManager em=JpaUtil.getEmf().createEntityManager();
		EntityTransaction tx =  em.getTransaction();
		tx.begin();		

		//Reservation res = new Reservation();		

		//em.persist(res);
		em.persist(a);

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
