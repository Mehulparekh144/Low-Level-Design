package chainofresponsibility;

public abstract class Salesman {
  public static int LOW_DISCOUNT = 10;
  public static int MEDIUM_DISCOUNT = 20;
  public static int HIGH_DISCOUNT = 30;

  Salesman nextSalesman;
  public Salesman(Salesman salesman){
    this.nextSalesman = salesman;
  }

  public void giveDiscount(int discount){
    if(nextSalesman != null){
      nextSalesman.giveDiscount(discount);
    } else{
      System.out.println("Can't give more than 30% discount.");
    }
  }

}
