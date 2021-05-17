package com.voyage.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.voyage.entities.Voyageur;
@Entity
@Table

public class Reservation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idReservation;
	// a vérifier !!!
		/**	@ManyToMany
		    @JoinTable
		    (
		            name="reservationvoyageur",
		            joinColumns= @JoinColumn(name="idReservation", referencedColumnName="idReservation"),
		            inverseJoinColumns=@JoinColumn(name="idVoyageur", referencedColumnName="idVoyageur") 
		            )
	private List<Voyageur> listeVoyageur; **/
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="Reservations")
	private List<Voyageur> listeVoyageur = new ArrayList <Voyageur>(0);
			
	private int numeroReservation;
	private double prixTotal;
	private EtatReservation etatReservation;
	@ManyToOne
	@JoinColumn(name="code-client")
	private Client  client;
	@ManyToOne
	@JoinColumn(name="code-voyage")
	private Voyage  voyage;
	public enum EtatReservation {
		EnCours,
	    EnAttente,
	    Acceptee,
	    Refusee;
		
	}


	
}
