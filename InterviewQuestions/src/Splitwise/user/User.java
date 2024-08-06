package Splitwise.user;

import Splitwise.balance.BalanceSheet;

public class User {
  String id;
  String name;
  BalanceSheet balanceSheet;

public User(String id, String name) {
    this.id = id;
    this.name = name;
    this.balanceSheet = new BalanceSheet();
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

  public BalanceSheet getBalanceSheet() {
    return balanceSheet;
  }

  public void setBalanceSheet(BalanceSheet balanceSheet) {
    this.balanceSheet = balanceSheet;
  }
}
