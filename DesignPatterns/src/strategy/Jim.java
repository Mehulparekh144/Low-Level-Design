package strategy;

public class Jim extends SalesDepartment{

  public Jim() {
    super(new FriendlyStrategy());
  }
}
