package ATM;

public class BankAccount {
  int balance;

  public void withdraw(int amount) {
    balance -= amount;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance){
    this.balance = balance;
  }
}
