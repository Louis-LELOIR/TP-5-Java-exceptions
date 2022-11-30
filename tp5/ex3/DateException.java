package tp5.ex3;

import java.lang.Exception;

public class DateException extends Exception {

  public DateException(int jour, int mois, int annee){
    super(jour + "/" + mois + "/" + annee);
  }
}