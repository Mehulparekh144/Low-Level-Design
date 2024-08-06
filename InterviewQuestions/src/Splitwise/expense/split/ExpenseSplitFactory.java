package Splitwise.expense.split;

public class ExpenseSplitFactory {

  public static ExpenseSplit getExpenseSplit(SplitType splitType) {
    return switch (splitType) {
      case EQUAL -> new EqualExpenseSplit();
      case UNEQUAL -> new UnequalExpenseSplit();
      case PERCENT -> new PercentExpenseSplit();
      default -> null;
    };
  }
}
