package com.voyage.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Avion")
public class Avion extends Prestation implements Serializable{

	private static final long serialVersionUID = -3283926983270289501L;
	
	private String aeroport;
	private String compagnie;
	
	public Avion(String dateDepart, String dateArrivee, double prixHT, String aeroport, String compagnie) {
		super(dateDepart,  dateArrivee, prixHT);
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
