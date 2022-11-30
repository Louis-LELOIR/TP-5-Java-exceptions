package tp5.exSynthese3;

import tp5.exSynthese3.*;

public class Entreprise {
  private String nom;
  private Employe[] listeEmployes;

  private static int nbEmployes = 0;

  public Entreprise(String nom) {
    this.nom = nom;
    this.listeEmployes = new Employe[]{};
  }

  public void ajouterEmploye(Employe employe){
    this.listeEmployes[nbEmployes] = employe;
    nbEmployes++;
    //this.listeEmployes[nbEmployes] = employe;
  }
  
}