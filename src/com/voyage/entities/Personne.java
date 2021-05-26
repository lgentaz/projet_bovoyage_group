package com.voyage.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



@Entity
@Table
@Inheritance
@DiscriminatorColumn(name="Pers_Type")
public abstract class Personne implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2947968825926141100L;
	@Id
	@GeneratedValue
	private long idPersonne;
	private String civilite;
	private String nom;
	private String prenom;
    private String email;
    
    @Autowired
	@Qualifier("adresse1")
    @OneToOne(cascade=CascadeType.MERGE)
    @JoinColumn(name="ADR_ID")
	private Adresse  adresse;
    

    /**
     * Default constructor
     */
    public Personne(String civilite, String nom, String prenom, String email, Adresse adresse) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
	}
    public Personne(){}
	/**
     * Getter/Setter
     */
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public long getPersonneId() {
		return idPersonne;
	}
	public void setPersonneId(long personneId) {
		this.idPersonne = personneId;
	}
	

 


}

