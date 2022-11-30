package tp5.ex2;

import java.lang.ArithmeticException;

public class InverseNombre {

  public static int inverse(int n) {
    try {
      return 1/n;
    } catch(ArithmeticException e) {
      return 0;
    }
  }
}