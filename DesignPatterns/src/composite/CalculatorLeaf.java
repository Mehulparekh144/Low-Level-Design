package composite;

public class CalculatorLeaf implements CalculatorComponent{

  int value;

  public CalculatorLeaf(int value) {
    this.value = value;
  }

  @Override
  public int calculate() {
    return value;
  }
}
