package com.voyage.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
//@Table single inherited from personne
@DiscriminatorValue("CLIENT")
public class Client  extends Personne{
	
private long idClient;
@OneToMany(mappedBy = "client",cascade= CascadeType.ALL,fetch = FetchType.LAZY)
private Collection<Reservation> reservation;
private MoyenPaiement  moyenPaiement;
}
