package ATM.state;

import ATM.ATM;
import ATM.Card;

public class SelectionState extends ATMState{

  public void selectOperation(ATM atm , Card card , TransactionType type){
    switch (type){
      case BALANCE -> atm.setState(new CheckBalanceState());
      case WITHDRAW -> atm.setState(new WithdrawCashState());
      default -> {
        System.out.println("Invalid operation");
        exit(atm);
      }
    }
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
