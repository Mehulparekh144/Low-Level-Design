package state.states;

import state.Coin;
import state.Item;
import state.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{

  public IdleState() {
    System.out.println("Vending Machine is in Idle State");
  }

  public IdleState(VendingMachine vendingMachine) {
    System.out.println("Vending Machine is in Idle State");
    vendingMachine.setCoinList(new ArrayList<>());
  }

  @Override
  public void pressInsertCoin(VendingMachine vendingMachine) throws Exception {
    vendingMachine.setState(new HasMoneyState());
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
    throw new Exception("Please press the insert coin button first");
  }

  @Override
  public void pressSelectProduct(VendingMachine vendingMachine) throws Exception {
    throw new Exception("You cannot select a product without inserting a coin first");
  }

  @Override
  public void selectProduct(VendingMachine vendingMachine, int code) throws Exception {
    throw new Exception("You cannot select a product without inserting a coin first");
  }

  @Override
  public int getChange(int returnAmount) throws Exception {
    throw new Exception("You cannot get change without selecting a product first");
  }

  @Override
  public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
    throw new Exception("You cannot dispense a product without selecting a product first");
  }

  @Override
  public List<Coin> refund(VendingMachine vendingMachine) throws Exception {
    throw new Exception("You cannot refund without inserting a coin first");
  }
}
