package Splitwise.expense;

import Splitwise.expense.split.Split;
import Splitwise.expense.split.SplitType;
import Splitwise.user.User;

import java.util.List;

public class Expense {
  String id;
  String desc;
  double amount;
  User paidBy;
  SplitType type;
  List<Split> list;

  public Expense(String id, String desc, double amount, User paidBy, SplitType type, List<Split> list) {
    this.id = id;
    this.desc = desc;
    this.amount = amount;
    this.paidBy = paidBy;
    this.type = type;
    this.list = list;
  }
}
