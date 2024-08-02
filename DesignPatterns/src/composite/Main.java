package composite;

public class Main {
  public static void main(String[] args) {
    CalculatorLeaf num1 = new CalculatorLeaf(10);
    CalculatorLeaf num2 = new CalculatorLeaf(5);
    CalculatorComposite sum = new CalculatorComposite(num1, num2 , Operation.ADDITION);

    CalculatorLeaf num3 = new CalculatorLeaf(12);
    CalculatorLeaf num4 = new CalculatorLeaf(6);
    CalculatorComposite diff = new CalculatorComposite(num3, num4 , Operation.SUBTRACTION);

    CalculatorComposite mul = new CalculatorComposite(sum, diff , Operation.MULTIPLICATION);
    System.out.println(mul.calculate());
  }
}
