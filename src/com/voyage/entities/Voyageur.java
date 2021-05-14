package com.voyage.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@DiscriminatorValue("VOYAGEUR")
public class Voyageur extends Personne {
	
	private long idVoyageur;
	private String numeroPieceIdentite;
	  private int age;
	  private Reservation  myReservation;
}
