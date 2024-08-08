package ATM.withdrawalResponsibility;

import ATM.ATM;
import ATM.Card;

public class FiveHundredProcessor extends CashWithdrawProcessor{

  public FiveHundredProcessor(CashWithdrawProcessor next) {
    super(next);
  }

  @Override
  public void withdraw(ATM atm, int amount , Card card) {
    int count = amount/500;
    int remaining = amount%500;

    if(count > 0 && count <= atm.getFiveHundredNotes()){
      atm.deductFiveHundredNotes(count);
      System.out.println("Dispensing "+count+" notes of 500");
    }
    else if(count > atm.getFiveHundredNotes()){
      atm.deductFiveHundredNotes(atm.getFiveHundredNotes());
      System.out.println("Dispensing "+atm.getFiveHundredNotes()+" notes of 500");
      remaining += (count - atm.getFiveHundredNotes())*500;
    }

    if(remaining > 0 && next != null){
      next.withdraw(atm, remaining , card);
    }
  }
}
