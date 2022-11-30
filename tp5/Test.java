package tp5;
import tp5.EntierNaturel;

public class Test {
  
  public static void main(String[] args) throws MauvaiseConstanteException{
    try { 
      System.out.println(new EntierNaturel(0));
    } catch (MauvaiseConstanteException e){
      System.out.println(e);
    }
  }
}