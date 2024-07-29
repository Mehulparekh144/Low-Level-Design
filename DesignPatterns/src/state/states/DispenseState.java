package state.states;

import state.Coin;
import state.Item;
import state.VendingMachine;

import java.util.List;

public class DispenseState implements State{

  public DispenseState() {
    System.out.println("Vending Machine is in Dispense State");
  }

  @Override
  public void pressInsertCoin(VendingMachine vendingMachine) throws Exception {
    throw new Exception("You cannot insert a coin without selecting a product first");
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
    throw new Exception("You cannot insert a coin without selecting a product first");
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
    return 0;
  }

  @Override
  public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
    System.out.println("Dispensing the product");
    Item item = vendingMachine.getInventory().getItem(code);
    vendingMachine.getInventory().updateItemAvailability(code);
    vendingMachine.setState(new IdleState());
    return item;
  }

  @Override
  public List<Coin> refund(VendingMachine vendingMachine) throws Exception {
    return List.of();
  }
}
