package com.voyage.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
@Inheritance
@DiscriminatorColumn(name="Pers_Typ")
public class Personne {
	@Id
	@GeneratedValue
	private long idPersonne;
	private String civilite;
	private String nom;
	private String prenom;
    private String email;
    @OneToOne
    @JoinColumn(name="idAdresse")
	private Adresse  myAdresse;
}
