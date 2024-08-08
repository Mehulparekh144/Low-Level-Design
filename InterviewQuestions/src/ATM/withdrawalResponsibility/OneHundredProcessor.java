package ATM.withdrawalResponsibility;

import ATM.ATM;
import ATM.Card;

public class OneHundredProcessor extends CashWithdrawProcessor{

  public OneHundredProcessor(CashWithdrawProcessor next) {
    super(next);
  }

  @Override
  public void withdraw(ATM atm, int amount , Card card) {
    int count = amount/100;
    int remaining = amount%100;

    if(count > 0 && count <= atm.getHundredNotes()){
      atm.deductHundredNotes(count);
      System.out.println("Dispensing "+count+" notes of 100");
    }
    else if(count > atm.getHundredNotes()){
      atm.deductHundredNotes(atm.getHundredNotes());
      System.out.println("Dispensing "+atm.getHundredNotes()+" notes of 100");
      remaining += (count - atm.getHundredNotes())*100;
    }

    if (remaining > 0) {
      card.setBalance(card.getBalance() + remaining);
      System.out.println("Remaining amount cannot be dispensed");
    }
  }
}
