package Splitwise.balance;

import Splitwise.expense.split.Split;
import Splitwise.user.User;

import java.util.List;

public class BalanceSheetManager {

public void updateUserExpense(User userPaidBy, List<Split> splits, double totalAmt) {
  // Get the balance sheet of the user who paid
  BalanceSheet balanceSheet = userPaidBy.getBalanceSheet();
  // Update the total amount paid by the user
  balanceSheet.setTotalMyPayment(balanceSheet.getTotalMyPayment() + totalAmt);

  // Iterate through each split to update balances
  for (Split split : splits) {
    User user = split.getUser();
    double amountOwe = split.getAmountOwe();
    BalanceSheet balanceSheet1 = user.getBalanceSheet();

    // If the user who paid is the same as the user in the split
    if (userPaidBy.getId().equals(user.getId())) {
      // Update the total expense for the user
      balanceSheet1.setTotalMyExpense(balanceSheet1.getTotalMyPayment() + amountOwe);
    } else {
      // Update the total amount the user should get back
      balanceSheet.setTotalMyGetBack(balanceSheet.getTotalMyGetBack() + amountOwe);

      // Get or create the balance for the user who owes money
      Balance userOweBalance;
      if (balanceSheet.getMap().containsKey(user.getId())) {
        userOweBalance = balanceSheet.getMap().get(user.getId());
      } else {
        userOweBalance = new Balance();
        balanceSheet.getMap().put(user.getId(), userOweBalance);
      }

      // Update the amount the user should get back
      userOweBalance.setAmountGetBack(userOweBalance.getAmountGetBack() + amountOwe);

      // Update the total amount the user owes
      balanceSheet1.setTotalMyOwe(balanceSheet1.getTotalMyOwe() + amountOwe);
      // Update the total expense for the user
      balanceSheet1.setTotalMyExpense(balanceSheet1.getTotalMyExpense() + amountOwe);

      // Get or create the balance for the user who should get back money
      Balance userGetBackBalance;
      if (balanceSheet1.getMap().containsKey(userPaidBy.getId())) {
        userGetBackBalance = balanceSheet1.getMap().get(userPaidBy.getId());
      } else {
        userGetBackBalance = new Balance();
        balanceSheet1.getMap().put(userPaidBy.getId(), userGetBackBalance);
      }
      // Update the amount the user owes
      userGetBackBalance.setAmountOwe(userGetBackBalance.getAmountOwe() + amountOwe);
    }
  }
}
  public void showBalanceSheet(User user){
    System.out.println("--------------------------------------------------------------------");
    System.out.println("User : " + user.getName());

    BalanceSheet balanceSheet = user.getBalanceSheet();

    System.out.println("Total Expense : " + balanceSheet.getTotalMyExpense());
    System.out.println("Total Owe : " + balanceSheet.getTotalMyOwe());
    System.out.println("Total Get Back : " + balanceSheet.getTotalMyGetBack());

    System.out.println("--------------------------------------------------------------------");

    balanceSheet.getMap().forEach((user1 , balance) -> {
      System.out.println("User : " + user1 + " you get back :" + balance.getAmountGetBack() + " you owe : " + balance.getAmountGetBack() );
    });

    System.out.println("--------------------------------------------------------------------");
  }
}
