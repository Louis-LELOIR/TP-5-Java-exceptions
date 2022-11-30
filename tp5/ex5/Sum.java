package tp5.ex5;

public class Sum {

  public static void getSum(String a, String b, String c) {
    int result = Integer.parseInt(a) + Integer.parseInt(b) +Integer.parseInt(c);
    System.out.println(result);
  }


  public static int somme(String[] tab) {
    int somme = 0;

    for (int i = 0; i < tab.length; i++){
      try{
        somme += Integer.parseInt(tab[i]);
      } catch (NumberFormatException e){
        System.out.println(tab[i] + " n'est pas un entier.");
      }
    }
    return somme;
  }
  
}