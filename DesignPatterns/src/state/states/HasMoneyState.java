package state.states;

import state.Coin;
import state.Item;
import state.VendingMachine;

import java.util.List;

public class HasMoneyState implements State{

  public HasMoneyState() {
    System.out.println("Vending Machine is in HasMoney State");
  }

  @Override
  public void pressInsertCoin(VendingMachine vendingMachine) throws Exception {
    return;
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
    vendingMachine.getCoinList().add(coin);
    System.out.println("Coin inserted: " + coin.getValue());
  }

  @Override
  public void pressSelectProduct(VendingMachine vendingMachine) throws Exception {
    vendingMachine.setState(new SelectionState());
  }

  @Override
  public void selectProduct(VendingMachine vendingMachine, int code) throws Exception {
    throw new Exception("You cannot select a product without pressing the select product button first");
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
    System.out.println("Refunding the coins");
    vendingMachine.setState(new IdleState());
    return vendingMachine.getCoinList();
  }
}
