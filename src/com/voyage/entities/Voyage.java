package com.voyage.entities;

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
public class Voyage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idVoyage;
	
	private int numeroVoyage;
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
}
