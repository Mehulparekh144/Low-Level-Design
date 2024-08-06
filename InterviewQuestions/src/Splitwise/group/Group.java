package Splitwise.group;

import Splitwise.expense.Expense;
import Splitwise.expense.ExpenseManager;
import Splitwise.expense.split.Split;
import Splitwise.expense.split.SplitType;
import Splitwise.user.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
  String id;
  String name;
  List<User> users;
  List<Expense> expenses;
  ExpenseManager expenseManager;

  public Group(){
    this.expenseManager = new ExpenseManager();
    this.users = new ArrayList<>();
    this.expenses = new ArrayList<>();
  }

  public void addMember(User user){
    users.add(user);
  }

  public void addExpense(String id , String desc , double expenseAmt , List<Split> splitList , SplitType type , User paidBy){
    Expense expense1 = expenseManager.createExpense(id , desc , expenseAmt , splitList , type , paidBy);
    expenses.add(expense1);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }

  public List<Expense> getExpenses() {
    return expenses;
  }

  public void setExpenses(List<Expense> expenses) {
    this.expenses = expenses;
  }

  public ExpenseManager getExpenseManager() {
    return expenseManager;
  }

  public void setExpenseManager(ExpenseManager expenseManager) {
    this.expenseManager = expenseManager;
  }
}
