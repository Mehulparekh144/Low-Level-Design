package chainofresponsibility;

public class Jim extends Salesman{

  public Jim(Salesman nextSalesman){
    super(nextSalesman);
  }

  public void giveDiscount(int discount){
    if(discount <= MEDIUM_DISCOUNT){
      System.out.println("Jim gives " + discount + "% discount.");
    } else{
      super.giveDiscount(discount);
    }
  }
}
