package com.voyage.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Adresse implements Serializable{

	private static final long serialVersionUID = 4746579738743642231L;

	@Id
	@GeneratedValue
	private long idAdresse;
	
	private String rue;
	private String ville;
	private String codePostal;
	private String pays;
	//private String region;
	
    /**
     * Default constructor
     */
	public Adresse(String rue, String ville, String codePostal, String pays) {
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
		this.pays = pays;
	}
	
    public Adresse() {
	}

	/**
     * Getter/Setter
     */
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}

	public long getAdresseId() {
		return idAdresse;
	}

	public void setAdresseId(long adresseId) {
		this.idAdresse = adresseId;
	}

	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", ville=" + ville + ", codePostal=" + codePostal + ", pays=" + pays + "]";
	}
	
	

  


}
