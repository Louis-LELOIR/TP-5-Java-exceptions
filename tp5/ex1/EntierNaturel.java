package tp5.ex1;
import tp5.ex1.MauvaiseConstanteException;

public class EntierNaturel {

  private int nombre;
  
  public EntierNaturel(int nombre) throws MauvaiseConstanteException {
    
    if (nombre != 10) {
      throw new MauvaiseConstanteException(nombre);
    }

    this.nombre = nombre;
    
  }

  public int getNaturel(){
    return this.nombre;
  }

  @Override
  public String toString(){
    return Integer.toString(nombre);
  }
}