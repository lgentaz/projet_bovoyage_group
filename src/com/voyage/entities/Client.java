package com.voyage.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Client")
public class Client extends Personne implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 7517880756375269875L;
 
	//private static final long serialVersionUID = -3921599594408962074L;
	@OneToMany(mappedBy = "client",cascade= CascadeType.ALL,fetch = FetchType.LAZY)
	private Collection<Reservation> reservations;
	//private MoyenPaiement moyenPaiement;
	private String moyenPaiement;
	
	public Client() {
		super();
	}
	
	/**public Client(String civilite, String nom, String prenom, String email, Adresse myAdresse,
			Collection<Reservation> reservations, MoyenPaiement moyenPaiement) {
		super(civilite, nom, prenom, email, myAdresse);
		this.reservations = reservations;
		this.moyenPaiement = moyenPaiement;
	}*/
	public Client(String civilite, String nom, String prenom, String email, Adresse myAdresse,
			Reservation reservation, String moyenPaiement) {
		super(civilite, nom, prenom, email, myAdresse);
		this.reservations.add(reservation);
		this.moyenPaiement = moyenPaiement;
	}

	public Collection<Reservation> getReservation() {
		return reservations;
	}

	public void setReservation(Collection<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	public void addReservation(Reservation reservation) {
		this.reservations.add(reservation);
	}

	/**public MoyenPaiement getMoyenPaiement() {
		return moyenPaiement;
	}

	public void setMoyenPaiement(MoyenPaiement moyenPaiement) {
		this.moyenPaiement = moyenPaiement;
	}*/
	
	public String getMoyenPaiement() {
		return moyenPaiement;
	}

	public void setMoyenPaiement(String moyenPaiement) {
		this.moyenPaiement = moyenPaiement;
	}

}
