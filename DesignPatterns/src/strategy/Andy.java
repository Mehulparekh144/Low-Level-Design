package strategy;

public class Andy extends SalesDepartment{
  public Andy() {
    super(new PersuasiveStrategy());
  }
}
