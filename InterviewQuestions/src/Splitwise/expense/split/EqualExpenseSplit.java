package Splitwise.expense.split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit{

  @Override
  public void validateRequest(List<Split> splitList, double totalAmount) {
    double amount = totalAmount / splitList.size();
    for(Split split : splitList){
      if(split.getAmountOwe() != amount){
        throw new RuntimeException("Invalid amount");
      }
    }
  }
}
