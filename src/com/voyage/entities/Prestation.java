package com.voyage.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table
public class Prestation {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Date dateDepart;
	  private Date dateArrivee;
	  private double prixHT;
	  @ManyToOne
		@JoinColumn(name="code-voyage")
	  private Voyage voyage;
}
