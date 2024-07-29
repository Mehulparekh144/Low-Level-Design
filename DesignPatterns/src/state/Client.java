package state;

import state.states.State;

public class Client {
  public static void main(String[] args) {
    VendingMachine vendingMachine = new VendingMachine();
    try{
      fillUpInventory(vendingMachine);
      displayInventory(vendingMachine);

      State state = vendingMachine.getState();
      state.pressInsertCoin(vendingMachine);

      // BUYING COKE
      state =  vendingMachine.getState();
      state.insertCoin(vendingMachine, Coin.DIME);
      state.insertCoin(vendingMachine, Coin.NICKEL);
      state.insertCoin(vendingMachine, Coin.PENNY);
      state.insertCoin(vendingMachine, Coin.PENNY);

      state.pressSelectProduct(vendingMachine);
      state = vendingMachine.getState();
      state.selectProduct(vendingMachine, 108);

      displayInventory(vendingMachine);

    } catch (Exception e){
      System.out.println(e.getMessage());
    }
  }

  private static void fillUpInventory(VendingMachine vendingMachine) {
    ItemShelf[] slots = vendingMachine.getInventory().getInventory();
    for (int i = 0; i < slots.length; i++) {
      Item item;
      if (i < 3) {
        item = new Item(ItemType.SODA, 10);
      } else if (i < 5) {
        item = new Item(ItemType.PEPSI, 5);
      } else if (i < 7) {
        item = new Item(ItemType.CHIPS, 7);
      } else if (i < 9) {
        item = new Item(ItemType.COKE, 15);
      } else {
        item = new Item(ItemType.CANDY, 3);
      }

      slots[i].setItem(item);
      slots[i].setAvailable(true);
    }
  }

    private static void displayInventory(VendingMachine vendingMachine){
      System.out.println("-------------------------------------------------------------------");
      ItemShelf[] slots = vendingMachine.getInventory().getInventory();
      for(ItemShelf shelf : slots){
        System.out.println("Code: " + shelf.getCode() + " , Item: " + shelf.getItem().getType() + " , Price: " + shelf.getItem().getPrice());
      }
      System.out.println("-------------------------------------------------------------------");

    }

}
