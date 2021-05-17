package com.voyage.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;

import com.voyage.daos.IDAOVoyageur;
import com.voyage.entities.Voyageur;
import com.voyage.util.JpaUtil;
import com.voyage.entities.Voyage;

@Repository("daoVoyageur")
public class DAOVoyageur implements IDAOVoyageur{boolean success=false;

public boolean addVoyageur(Voyageur v) {
try {
EntityManager em=JpaUtil.getEmf().createEntityManager();

// 2 : Ouverture transaction 
EntityTransaction tx =  em.getTransaction();
tx.begin();

// 3 : Instanciation Objet(s) m�tier (s)
//Contact contact = new Contact(firstname,lastname, email);


// 4 : Persistance Objet/Relationnel : cr�ation d'un enregistrement en base
em.persist(v);

// 5 : Fermeture transaction 
tx.commit();

// 6 : Fermeture de l'EntityManager et de unit� de travail JPA 
em.close();
	

success=true;
}
catch (Exception e) {
	e.printStackTrace();
	
}
return success;
}



}



