package ATM.state;

import ATM.ATM;
import ATM.Card;

public class CheckBalanceState extends ATMState{

  public void displayBalance(ATM atm , Card card){
    System.out.println("Balance: " + card.getBalance());
    exit(atm);
  }

  public void exit(ATM atm) {
    returnCard();
    atm.setState(new IdleState());
    System.out.println("Exiting");
  }

  public void returnCard() {
    System.out.println("Card returned");
  }
}
