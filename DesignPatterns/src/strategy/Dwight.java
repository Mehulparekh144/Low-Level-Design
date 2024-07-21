package strategy;

public class Dwight extends SalesDepartment{

    public Dwight() {
      super(new AggressiveStrategy());
    }
}
