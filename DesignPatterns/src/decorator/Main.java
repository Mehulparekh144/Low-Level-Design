package decorator;

import decorator.toppings.Cheese;
import decorator.toppings.Mushroom;

public class Main {
  public static void main(String[] args) {
    BasePizza pizza = new Margherita();
    System.out.println(pizza.cost());
    pizza = new Cheese(pizza);
    System.out.println(pizza.cost());
    pizza = new Cheese(pizza);
    System.out.println(pizza.cost());
    pizza = new Mushroom(pizza);
    System.out.println(pizza.cost());
  }
}
