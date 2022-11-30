import tp5.*;
import tp5.ex4.*;
import java.lang.ArithmeticException;

public class Main {
  
  public static void main(String[] args) throws Exception {
    //System.out.println(InverseNombre.inverse(0));
    //System.out.println(new DateJour(8, 25, 5555));
    int[] tableauDeDonnees = new int[] {1,2,3,4,5};
    
    tableauDeDonnees = AddInputOnArray.add(tableauDeDonnees, 6, 2);
    for (int i = 0 ; i <= tableauDeDonnees.length - 1  ; i ++ ) {
      System.out.println(tableauDeDonnees[i]);
    }
  }
  
}