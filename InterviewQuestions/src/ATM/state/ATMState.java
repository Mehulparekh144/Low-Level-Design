package ATM.state;

import ATM.ATM;
import ATM.Card;

public  class ATMState {

  public void insertCard(ATM atm , Card card){
    throw new UnsupportedOperationException("Not supported yet.");
  }
  public void authPin(ATM atm , Card card , int pin){
    throw new UnsupportedOperationException("Not supported yet.");
  }
  public void exit(ATM atm){
    throw new UnsupportedOperationException("Not supported yet.");
  }
  public void returnCard(){
    throw new UnsupportedOperationException("Not supported yet.");
  }
  public void withdraw(ATM atm , Card card , int amount){
    throw new UnsupportedOperationException("Not supported yet.");
  }
  public void selectOperation(ATM atm , Card card , TransactionType type){
    throw new UnsupportedOperationException("Not supported yet.");
  }
  public void displayBalance(ATM atm , Card card){
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
