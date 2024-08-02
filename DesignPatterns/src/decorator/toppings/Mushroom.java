package decorator.toppings;

import decorator.BasePizza;

public class Mushroom extends ToppingDecorator {

  public Mushroom(BasePizza pizza) {
    super(pizza);
  }

  @Override
  public int cost() {
    return pizza.cost() + 15;
  }
}
