package com.voyage.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@Table single inherited from personne
@DiscriminatorValue("Avion")
public class Avion extends Prestation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6464958753016860640L;
	private String aeroport;
	private String compagnie;
	
	public Avion(Date dateDepart, Date dateArrivee, double prixHT, Voyage voyage, String aeroport, String compagnie) {
		super(dateDepart, dateArrivee, prixHT, voyage);
		this.aeroport = aeroport;
		this.compagnie = compagnie;
	}
	
	public Avion() {
		super();
	}

	public String getAeroport() {
		return aeroport;
	}

	public void setAeroport(String aeroport) {
		this.aeroport = aeroport;
	}

	public String getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}
	
}
