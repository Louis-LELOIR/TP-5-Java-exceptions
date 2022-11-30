package tp5.ex4;

import java.lang.Exception;

public class AddInputOnArray {

  public static int[] add(int[] tableau, int n, int indice) {
    try {
      int[] temp = new int[tableau.length + 1];

      for (int index = 0 ; index < indice ; index ++) {
        temp[index] = tableau[index];
      }
      
      temp[indice] = n;
      
      for (int j = indice + 1 ; j < tableau.length ; j ++) {
        temp[j] = tableau[j];
      }
  
      return temp;
    } 
    catch(Exception e) {
      e.printStackTrace();
      throw e;
    }
  }


  public static int[] erase(int[] tableau, int n, int indice) {
    try {
      int[] temp = new int[tableau.length + 1];

      for (int index = 0 ; index < indice ; index ++) {
        temp[index] = tableau[index];
      }
      
      temp[indice] = n;
      
      for (int j = indice + 1 ; j < tableau.length ; j ++) {
        temp[j] = tableau[j];
      }
  
      return temp;
    } 
    catch(Exception e) {
      e.printStackTrace();
      throw e;
    }
  }
}