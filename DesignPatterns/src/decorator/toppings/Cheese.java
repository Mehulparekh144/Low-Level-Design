package decorator.toppings;

import decorator.BasePizza;

public class Cheese extends ToppingDecorator{


  public Cheese(BasePizza pizza) {
    super(pizza);
  }

  @Override
  public int cost() {
    return pizza.cost() + 10;
  }
}
