package composite;

import java.util.List;

public class CalculatorComposite implements CalculatorComponent{

  CalculatorComponent left;
  CalculatorComponent right;
  Operation operation;


  public CalculatorComposite(CalculatorComponent left, CalculatorComponent right , Operation operation) {
    this.left = left;
    this.right = right;
    this.operation = operation;
  }

  @Override
  public int calculate() {

    return switch (operation) {
      case ADDITION -> left.calculate() + right.calculate();
      case SUBTRACTION -> left.calculate() - right.calculate();
      case MULTIPLICATION -> left.calculate() * right.calculate();
      case DIVISION -> left.calculate() / right.calculate();
    };
  }
}
