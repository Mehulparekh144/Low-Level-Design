package ATM;

import ATM.state.TransactionType;

public class ATMRoom {

  User user;
  ATM atm;

  void initialize(){
    initATM();
    initUser();

    atm.getState().insertCard(atm , user.getCard());
    atm.getState().authPin(atm , user.getCard() , 1234);

    atm.getState().selectOperation(atm , user.getCard() , TransactionType.WITHDRAW);
    atm.getState().withdraw(atm , user.getCard() , 1300);

    atm.getState().insertCard(atm , user.getCard());
    atm.getState().authPin(atm , user.getCard() , 1234);
    atm.getState().selectOperation(atm , user.getCard() , TransactionType.BALANCE);
    atm.getState().displayBalance(atm , user.getCard());

    atm.currentATMStatus();

  }

  void initATM(){
    this.atm = ATM.getInstance();
    atm.setATMBalance(10000, 10, 10, 10);
  }

  void initUser(){
    Card card = new Card();
    BankAccount account = new BankAccount();
    account.setBalance(4000);
    card.setBankAccount(account);
    this.user = new User("John" , card , account);
  }
}
