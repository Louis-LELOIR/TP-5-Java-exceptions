package tp5.ex3;

import tp5.ex3.*;

public class DateJour {

  private int jour, mois, annee;

  public DateJour(int jour, int mois, int annee) throws DateException {
    
    
    if (!estValide(jour, mois, annee)) throw new DateException(jour, mois, annee);

    this.jour= jour;
    this.mois = mois;
    this.annee = annee;
    
  }

  private static boolean estBissextile(int an) {
    boolean bis = false;
    if (an % 4 == 0 && an % 100 != 0) {
      bis = true;
    } else if (an % 400 == 0) {
      bis = true;
    }
    return bis;
  }

  private static final int[] JOURS_PAR_MOIS = {31, 28, 31,30,31,30,31,31,30,31,30,31};

  private static boolean estValide(int jour, int mois, int an) {
    boolean ret = true;
    if (jour < 1 || mois < 1 || mois > 12) {
      ret = false;
    } else {
      int bonus = (mois == 2 && estBissextile(an)) ? 1 : 0;

      int jourMax = DateJour.JOURS_PAR_MOIS[mois] + bonus;
  
      if (jour > jourMax)
        ret = false;
    }

    return ret;
  }
}