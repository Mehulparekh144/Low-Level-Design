package chainofresponsibility;

public class Main {
  public static void main(String[] args) {
    Salesman salesman = new Dwight(new Jim(new Michael(null)));

    salesman.giveDiscount(5);
    salesman.giveDiscount(15);
    salesman.giveDiscount(30);
    salesman.giveDiscount(40);
  }
}
