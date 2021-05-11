package com.voyage.entities;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Hotel  extends Prestation{
	
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
}
