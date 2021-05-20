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
	/**
	 * 
	 */
	private static final long serialVersionUID = 7369471874677447990L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idVoyage;
	
	private long numeroVoyage;
	private Statut statut;
	private double prix;
	private String destination;
	
	@OneToMany(mappedBy = "voyage",cascade= CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Reservation>  reservations;
	
	@OneToMany(mappedBy = "voyage",cascade= CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Prestation> prestations;
	
	public enum Statut {
		Disponible,
		Clos;
	}

	public Voyage(Statut statut, double prix, String destination, List<Reservation> reservations,
			List<Prestation> prestations) {
		this.statut = statut;
		this.prix = prix;
		this.destination = destination;
		this.reservations = reservations;
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

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
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

	public List<Prestation> getPrestations() {
		return prestations;
	}

	public void setPrestations(List<Prestation> prestations) {
		this.prestations = prestations;
	}
	
	
}
