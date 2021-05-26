package com.voyage.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("Hotel")
public class Hotel extends Prestation implements Serializable{

	private static final long serialVersionUID = -2663385758959859309L;
	
	private double prixChambre;
    @OneToOne
    @JoinColumn(name="idAdresse")
    private Adresse adresse;
    private Formule formule;
	private TypeChambre typeChambre;
	
	public enum Formule {
		SansPension,
	    DemiPension,
	    PetitDejeuner,
	    FullPension;
	}
	
	public enum TypeChambre {
		litDouble,
		litSimple,
		Suite;
	}
	
    public Hotel(String dateDepart, String dateArrivee, double prixHT, double prixChambre, Adresse adresse,
			Formule formule, TypeChambre typeChambre) {
		super(dateDepart, dateArrivee, prixHT);
		this.prixChambre = prixChambre;
		this.adresse = adresse;
		this.formule = formule;
		this.typeChambre = typeChambre;
	}
    
    public Hotel() {
	}

	public double getPrixChambre() {
		return prixChambre;
	}

	public void setPrixChambre(double prixChambre) {
		this.prixChambre = prixChambre;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Formule getFormule() {
		return formule;
	}

	public void setFormule(Formule formule) {
		this.formule = formule;
	}

	public TypeChambre getTypeChambre() {
		return typeChambre;
	}

	public void setTypeChambre(TypeChambre typeChambre) {
		this.typeChambre = typeChambre;
	}
}
