package state.states;

import state.Coin;
import state.Item;
import state.VendingMachine;

import java.util.List;

public class SelectionState implements State{

  public SelectionState() {
    System.out.println("Vending Machine is in Selection State");
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
    return;
  }

  @Override
  public void selectProduct(VendingMachine vendingMachine, int code) throws Exception {
    Item item = vendingMachine.getInventory().getItem(code);
    if(item == null){
      throw new Exception("Item not found");
    }

    int coinsInserted = 0;
    for(Coin coin : vendingMachine.getCoinList()){
      coinsInserted += coin.getValue();
    }

    if(coinsInserted < item.getPrice()){
      System.out.println("Insufficient funds , You paid: " + coinsInserted + " , " +
          "Item price: " + item.getPrice() + " , Please insert more coins");
      refund(vendingMachine);
      throw new Exception("Insufficient funds");
    }

    if(item.getPrice() <= coinsInserted){
      if(item.getPrice() < coinsInserted){
        int change = coinsInserted - item.getPrice();
        getChange(change);
      }
      vendingMachine.setState(new DispenseState());
    }


  }

  @Override
  public int getChange(int returnAmount) throws Exception {
    System.out.println("Returning the change: " + returnAmount);
    return returnAmount;
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
