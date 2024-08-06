package Splitwise.balance;

import Splitwise.user.User;

import java.util.HashMap;
import java.util.Map;

public class BalanceSheet {
  Map<String, Balance> map;
  double totalMyExpense;
  double totalMyOwe;
  double totalMyGetBack;
  double totalMyPayment;

  public BalanceSheet(){
    this.map = new HashMap<>();
    this.totalMyExpense = 0;
    this.totalMyOwe = 0;
    this.totalMyGetBack = 0;
    this.totalMyPayment = 0;
  }

  public double getTotalMyPayment() {
    return totalMyPayment;
  }

  public void setTotalMyPayment(double totalMyPayment) {
    this.totalMyPayment = totalMyPayment;
  }

  public Map<String, Balance> getMap() {
    return map;
  }

  public void setMap(Map<String, Balance> map) {
    this.map = map;
  }

  public double getTotalMyExpense() {
    return totalMyExpense;
  }

  public void setTotalMyExpense(double totalMyExpense) {
    this.totalMyExpense = totalMyExpense;
  }

  public double getTotalMyOwe() {
    return totalMyOwe;
  }

  public void setTotalMyOwe(double totalMyOwe) {
    this.totalMyOwe = totalMyOwe;
  }

  public double getTotalMyGetBack() {
    return totalMyGetBack;
  }

  public void setTotalMyGetBack(double totalMyGetBack) {
    this.totalMyGetBack = totalMyGetBack;
  }
}
