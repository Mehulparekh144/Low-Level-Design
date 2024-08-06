package Splitwise.expense.split;

import java.util.List;

public class UnequalExpenseSplit implements ExpenseSplit{
  @Override
  public void validateRequest(List<Split> splitList, double totalAmount) {
    double amount = 0;
    for(Split split : splitList){
      amount += split.getAmountOwe();
    }
    if(amount != totalAmount){
      throw new RuntimeException("Invalid amount");
    }
  }
}
