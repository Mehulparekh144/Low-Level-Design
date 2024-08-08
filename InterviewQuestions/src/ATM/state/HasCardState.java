package ATM.state;

import ATM.ATM;
import ATM.Card;

public class HasCardState extends ATMState {

  public void authPin(ATM atm, Card card, int pin) {
    if (!card.isPinCorrect(pin)) {
      System.out.println("Incorrect pin");
      exit(atm);
    }
    System.out.println("Pin correct");
    atm.setState(new SelectionState());
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
