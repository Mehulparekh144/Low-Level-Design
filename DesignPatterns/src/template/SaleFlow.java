package template;

public abstract class SaleFlow {

  abstract void visit();
  abstract void selectQuantity();
  abstract void pay();
  abstract void confirm();

  public void process() {
    visit();
    selectQuantity();
    pay();
    confirm();
  }
}
