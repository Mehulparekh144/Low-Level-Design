package chainofresponsibility;

public class Dwight extends Salesman{

  public Dwight(Salesman nextSalesman) {
    super(nextSalesman);
  }

  public void giveDiscount(int discount){
    if(discount <= LOW_DISCOUNT){
      System.out.println("Dwight gives " + discount + "% discount.");
    } else{
      super.giveDiscount(discount);
    }
  }
}
