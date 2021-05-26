package com.voyage.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;

import com.voyage.entities.Prestation;
import com.voyage.util.JpaUtil;

@Repository("daoPrestation")
public class DAOPrestation implements IDAOPrestation{
	
	boolean success=false;

	@Override
	public boolean addPrestation(Prestation p) {
		try {
			EntityManager em=JpaUtil.getEmf().createEntityManager();
			
			// 2 : Ouverture transaction 
			EntityTransaction tx =  em.getTransaction();
			tx.begin();
			
			// 3 : Instanciation Objet(s) m�tier (s)
			//Contact contact = new Contact(firstname,lastname, email);
			
			
			// 4 : Persistance Objet/Relationnel : cr�ation d'un enregistrement en base
			em.persist(p);
			
			// 5 : Fermeture transaction 
			tx.commit();
			
			// 6 : Fermeture de l'EntityManager et de unit� de travail JPA 
			em.close();
				
			
			success=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}
	
	
	

}
