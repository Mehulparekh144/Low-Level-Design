package Splitwise.expense;

import Splitwise.balance.BalanceSheetManager;
import Splitwise.expense.split.ExpenseSplit;
import Splitwise.expense.split.ExpenseSplitFactory;
import Splitwise.expense.split.Split;
import Splitwise.expense.split.SplitType;
import Splitwise.user.User;

import java.util.List;

public class ExpenseManager {

  BalanceSheetManager balanceSheetManager;

  public ExpenseManager() {
    this.balanceSheetManager = new BalanceSheetManager();
  }

  public Expense createExpense(String id , String desc , double expenseAmt , List<Split> splitList , SplitType type , User paidBy){
    ExpenseSplit split = ExpenseSplitFactory.getExpenseSplit(type);
    if(split == null){
      System.out.println("Invalid Split Type");
      return null;
    }
    split.validateRequest(splitList , expenseAmt);
    Expense expense = new Expense(id , desc , expenseAmt , paidBy , type , splitList);

    //Balance sheet logic
    balanceSheetManager.updateUserExpense(paidBy , splitList , expenseAmt);

    return expense;
  }


}
