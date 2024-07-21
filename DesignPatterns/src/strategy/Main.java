package strategy;

public class Main {

  public static void main(String[] args) {
    SalesDepartment andy = new Andy();
    SalesDepartment dwight = new Dwight();
    SalesDepartment jim = new Jim();

    jim.sell();
    andy.sell();
    dwight.sell();
  }
}
