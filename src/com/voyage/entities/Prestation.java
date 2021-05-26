package com.voyage.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
@Inheritance
@DiscriminatorColumn(name="Presta_Type")
public abstract class Prestation implements Serializable {

	private static final long serialVersionUID = 2789566000296880107L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPrestation;
	private String dateDepart;
	private String dateArrivee;
	private double prixHT;
	@ManyToOne
	@JoinColumn(name="idVoyage")
	private Voyage voyage;
	
	public Prestation(String dateDepart, String dateArrivee, double prixHT) {
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.prixHT = prixHT;
	}
	
	public Prestation() {
	}

	public String getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}

	public String getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(String dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public Voyage getVoyage() {
		return voyage;
	}

	public void setVoyage(Voyage voyage) {
		this.voyage = voyage;
	}
	  
}
