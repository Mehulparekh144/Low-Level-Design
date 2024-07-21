package strategy;

public class SalesDepartment {

  private final SalesStrategy salesStrategy;

  public SalesDepartment(SalesStrategy salesStrategy) {
    this.salesStrategy = salesStrategy;
  }

  public void sell() {
    salesStrategy.sell();
  }
}
