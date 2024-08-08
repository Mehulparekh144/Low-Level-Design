package ATM.withdrawalResponsibility;

import ATM.ATM;

import ATM.Card;

public abstract class CashWithdrawProcessor {

  final CashWithdrawProcessor next;

  public CashWithdrawProcessor(CashWithdrawProcessor next) {
    this.next = next;
  }

  public void withdraw(ATM atm, int amount , Card card){
    if(next != null){
      next.withdraw(atm, amount , card);
    }
  }


}
