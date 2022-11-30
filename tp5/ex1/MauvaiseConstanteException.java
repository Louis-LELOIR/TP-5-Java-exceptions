package tp5.ex1;

public class MauvaiseConstanteException extends Exception {

  private String message;
  public final int n;

  public MauvaiseConstanteException(String message, int n){
    super(message);
    this.n = n;
  }

  public MauvaiseConstanteException(int n){
    super("KIKOU");
    this.n = n;
  }
}