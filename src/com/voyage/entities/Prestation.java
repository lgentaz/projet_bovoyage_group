package com.voyage.entities;

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
public abstract class Prestation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Date dateDepart;
	private Date dateArrivee;
	private double prixHT;
	@ManyToOne
	@JoinColumn(name="code-voyage")
	private Voyage voyage;
	
	public Prestation(Date dateDepart, Date dateArrivee, double prixHT, Voyage voyage) {
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.prixHT = prixHT;
		this.voyage = voyage;
	}
	
	public Prestation() {
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
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
