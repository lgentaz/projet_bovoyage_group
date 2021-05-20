package com.voyage.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.voyage.entities.Voyageur;

@Entity
@Table
public class Reservation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 495778063949816443L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idReservation;
	
	@ManyToMany
	@JoinTable(name="reservationvoyageur",
	   joinColumns= @JoinColumn(name="idReservation", referencedColumnName="idReservation"),
	   inverseJoinColumns=@JoinColumn(name="idVoyageur", referencedColumnName="idVoyageur"))
	private Collection<Voyageur> listeVoyageur = new ArrayList <Voyageur>();
			
	private long numeroReservation;
	private double prixTotal;
	private EtatReservation etatReservation;
	@ManyToOne
	@JoinColumn(name="code-client")
	private Client client;
	@ManyToOne
	@JoinColumn(name="code-voyage")
	private Voyage voyage;
	
	public enum EtatReservation {
		EnCours,
	    EnAttente,
	    Acceptee,
	    Refusee;
	}

	public Reservation() {
	}	
	
	public Reservation(Collection<Voyageur> listeVoyageur, double prixTotal, Client client, Voyage voyage) {
		this.listeVoyageur = listeVoyageur;
		this.numeroReservation = idReservation;
		this.prixTotal = prixTotal;
		this.etatReservation = EtatReservation.EnCours;
		this.client = client;
		this.voyage = voyage;
	}

	public long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(long idReservation) {
		this.idReservation = idReservation;
	}

	public Collection<Voyageur> getListeVoyageur() {
		return listeVoyageur;
	}

	public void setListeVoyageur(Collection<Voyageur> listeVoyageur) {
		this.listeVoyageur = listeVoyageur;
	}
	
	public void addVoyageur(Voyageur voyageur) {
		this.listeVoyageur.add(voyageur);
	}

	public long getNumeroReservation() {
		return numeroReservation;
	}

	public void setNumeroReservation(long numeroReservation) {
		this.numeroReservation = numeroReservation;
	}

	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public EtatReservation getEtatReservation() {
		return etatReservation;
	}

	public void setEtatReservation(EtatReservation etatReservation) {
		this.etatReservation = etatReservation;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Voyage getVoyage() {
		return voyage;
	}

	public void setVoyage(Voyage voyage) {
		this.voyage = voyage;
	}
	
}
