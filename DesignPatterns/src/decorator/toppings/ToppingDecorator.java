package decorator.toppings;

import decorator.BasePizza;

public abstract class ToppingDecorator extends BasePizza {

  BasePizza pizza;
  public ToppingDecorator(BasePizza pizza) {
    this.pizza = pizza;
  }
}
