package ATM.state;

import ATM.ATM;
import ATM.Card;
import ATM.withdrawalResponsibility.CashWithdrawProcessor;
import ATM.withdrawalResponsibility.FiveHundredProcessor;
import ATM.withdrawalResponsibility.OneHundredProcessor;
import ATM.withdrawalResponsibility.TwoThousandProcessor;

public class WithdrawCashState extends ATMState{

  public void withdraw(ATM atm , Card card , int amount){
    if(atm.getATMBalance() < amount) {
      System.out.println("ATM out of cash");
      exit(atm);
    } else if(card.getBalance() < amount){
      System.out.println("Insufficient balance in account");
      exit(atm);
    } else{
      card.deductBalance(amount);
      atm.deductAmount(amount);

      CashWithdrawProcessor processor = new TwoThousandProcessor(new FiveHundredProcessor(new OneHundredProcessor(null)));
      processor.withdraw(atm , amount , card);
      exit(atm);
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
