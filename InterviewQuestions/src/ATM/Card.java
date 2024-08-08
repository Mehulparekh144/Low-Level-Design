package ATM;

public class Card {
  private int cvv;
  private String name;
  private int expiryDate;
  private String holderName;
  private static final int PIN = 1234;
  private BankAccount bankAccount;

  public boolean isPinCorrect(int pin){
    return pin == PIN;
  }

  public void setBankAccount(BankAccount bankAccount){
    this.bankAccount = bankAccount;
  }


  public void deductBalance(int amount){
    bankAccount.withdraw(amount);
  }

  public void setBalance(int balance){
    bankAccount.setBalance(balance);
  }

  public int getBalance(){
    return bankAccount.getBalance();
  }
}
