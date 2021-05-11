package com.voyage.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Adresse {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long IdAdresse;
	private String rue;
	private String ville;
	private String codePostal;
	private String pays;
	private String region;
}
