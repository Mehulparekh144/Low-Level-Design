package chainofresponsibility;

public class Michael extends Salesman{

  public Michael(Salesman salesman) {
    super(salesman);
  }

  public void giveDiscount(int discount){
    if(discount <= HIGH_DISCOUNT){
      System.out.println("Michael gives " + discount + "% discount.");
    } else{
      super.giveDiscount(discount);
    }
  }
}
