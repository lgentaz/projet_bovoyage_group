package com.voyage.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.voyage.entities.Adresse;
import com.voyage.entities.Reservation;

@Entity
@DiscriminatorValue("Voyageur")
public class Voyageur extends Personne implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2996738032361801269L;

	
	private String pieceIdentite;
	private int age;
	
	
	@ManyToMany (cascade=CascadeType.MERGE)
	@JoinTable (name="ReservationVoyageur",
	joinColumns=@JoinColumn(name="idVoyageur", referencedColumnName="idPersonne"),
	inverseJoinColumns=@JoinColumn(name="NUMRESERVATION", referencedColumnName="idReservation"))
	private List<Reservation> Reservations = new ArrayList <Reservation>(0);
	
    /**
     * Default constructor
     */
    public Voyageur(String civilite, String nom, String prenom, String email, Adresse myAdresse, String pieceIdentite,
			int age) {
		super(civilite, nom, prenom, email, myAdresse);
		this.pieceIdentite = pieceIdentite;
		this.age = age;
	}

	public Voyageur(String pieceIdentite, int age) {
		this.pieceIdentite = pieceIdentite;
		this.age = age;
	}
	public Voyageur(String civilite, String nom, String prenom, String email, Adresse myAdresse, String pieceIdentite,
		int age, List<Reservation> reservations) {
		super(civilite, nom, prenom, email, myAdresse);
		this.pieceIdentite = pieceIdentite;
		this.age = age;
		this.Reservations = reservations;
	}
	public Voyageur() {
	}
	/**
     * Getter/Setter
     */
	
	public String getPieceIdentite() {
		return pieceIdentite;
	}
	public void setPieceIdentite(String pieceIdentite) {
		this.pieceIdentite = pieceIdentite;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public List<Reservation> getReservations() {
		return Reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		Reservations = reservations;
	}

	@Override
	public String toString() {
		return "Voyageur [ pieceIdentite=" + pieceIdentite + ", age=" + age
				+ ", Reservations=" + Reservations + "]";
	}
}
