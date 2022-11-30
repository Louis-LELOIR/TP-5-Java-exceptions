package tp5.ex4;

import java.lang.Exception;

public class AddInputOnArray {

  public static int[] add(int[] tableau, int n, int indice) {
    try {
      
      int[] temp = new int[tableau.length + 1];

      for (int index = 0 ; index < indice ; index ++) {
        temp[index] = tableau[index];
        //System.out.println(temp[index]);
      }
      
      temp[indice] = n;
      
      for (int j = indice + 1 ; j < tableau.length ; j ++) {
        temp[j] = tableau[j];
        //System.out.println(temp[j]);
      }
  
      return temp;
    } 
    catch(Exception e) {
      e.printStackTrace();
      throw e;
    }
  }
}