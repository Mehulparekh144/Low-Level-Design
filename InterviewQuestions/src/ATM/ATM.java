package ATM;

import ATM.state.ATMState;
import ATM.state.IdleState;

public class ATM {

  private static final ATM instance = new ATM(); // Singleton instance
  private ATMState state;
  private int balance;
  private int twoThousandNotes;
  private int fiveHundredNotes;
  private int hundredNotes;

  private ATM(){

  }

  public static ATM getInstance(){
    instance.setState(new IdleState());
    return instance;
  }

  public void setState(ATMState state){
    this.state = state;
  }

  public ATMState getState(){
    return state;
  }

  public void setATMBalance(int balance , int twoThousandNotes , int fiveHundredNotes , int hundredNotes){
    this.balance = balance;
    this.twoThousandNotes = twoThousandNotes;
    this.fiveHundredNotes = fiveHundredNotes;
    this.hundredNotes = hundredNotes;
  }

  public int getATMBalance(){
    return balance;
  }

  public void currentATMStatus(){
    System.out.println("Balance : " + balance);
    System.out.println("Two Thousand Notes : " + twoThousandNotes);
    System.out.println("Five Hundred Notes : " + fiveHundredNotes);
    System.out.println("Hundred Notes : " + hundredNotes);
  }

  public int getTwoThousandNotes() {
    return twoThousandNotes;
  }

  public int getFiveHundredNotes() {
    return fiveHundredNotes;
  }

  public int getHundredNotes() {
    return hundredNotes;
  }

  public void deductAmount(int amount){
    balance -= amount;
  }

  public void deductTwoThousandNotes(int notes){
    twoThousandNotes -= notes;
  }

  public void deductFiveHundredNotes(int notes){
    fiveHundredNotes -= notes;
  }

  public void deductHundredNotes(int notes){
    hundredNotes -= notes;
  }
}
