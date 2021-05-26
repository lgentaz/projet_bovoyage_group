package com.voyage.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Voyage implements Serializable {

	private static final long serialVersionUID = 639545271601960442L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idVoyage;
	
	private long numeroVoyage;
	private boolean disponible;
	private double prix;
	private String destination;
	
	@OneToMany(mappedBy = "voyage",cascade= CascadeType.MERGE,fetch = FetchType.LAZY)
	private List<Reservation>  reservations;
	
	@OneToMany(mappedBy = "voyage",cascade= CascadeType.MERGE,fetch = FetchType.LAZY)
	private List<Prestation> prestations;
	

	public Voyage(double prix, String destination, List<Prestation> prestations) {
		this.disponible = true;
		this.prix = prix;
		this.destination = destination;
		this.prestations = prestations;
		this.numeroVoyage = this.idVoyage;
	}
	
	public Voyage() {
	}

	public long getNumeroVoyage() {
		return numeroVoyage;
	}

	public void setNumeroVoyage(long numeroVoyage) {
		this.numeroVoyage = numeroVoyage;
	}

	public boolean getStatut() {
		return disponible;
	}

	public void setStatut(boolean statut) {
		this.disponible = statut;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	public void addReservations(Reservation reservation) {
		this.reservations.add(reservation);
	}

	public List<Prestation> getPrestations() {
		return prestations;
	}

	public void setPrestations(List<Prestation> prestations) {
		this.prestations = prestations;
	}
	
	public void addPrestations(Prestation prestation) {
		this.prestations.add(prestation);
	}
	
	
}
