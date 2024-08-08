package ATM.withdrawalResponsibility;

import ATM.ATM;
import ATM.Card;

public class TwoThousandProcessor extends CashWithdrawProcessor{

  public TwoThousandProcessor(CashWithdrawProcessor next) {
    super(next);
  }

  public void withdraw(ATM atm, int amount , Card card){
    int count = amount/2000;
    int remaining = amount%2000;

    if(count > 0 && count <= atm.getTwoThousandNotes()){
      atm.deductTwoThousandNotes(count);
      System.out.println("Dispensing "+count+" notes of 2000");
    }
    else if(count > atm.getTwoThousandNotes()){
      atm.deductTwoThousandNotes(atm.getTwoThousandNotes());
      System.out.println("Dispensing "+atm.getTwoThousandNotes()+" notes of 2000");
      remaining += (count - atm.getTwoThousandNotes())*2000;
    }

    if(remaining > 0 && next != null){
      next.withdraw(atm, remaining , card);
    }
  }

}
