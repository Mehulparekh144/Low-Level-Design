package state.states;

import state.Coin;
import state.Item;
import state.VendingMachine;

import java.util.List;

public interface State {
  void pressInsertCoin(VendingMachine vendingMachine) throws Exception;
  void insertCoin(VendingMachine vendingMachine , Coin coin) throws Exception;
  void pressSelectProduct(VendingMachine vendingMachine) throws Exception;
  void selectProduct(VendingMachine vendingMachine , int code) throws Exception;
  int getChange(int returnAmount) throws Exception;
  Item dispenseProduct(VendingMachine vendingMachine , int code) throws Exception;
  List<Coin> refund(VendingMachine vendingMachine) throws Exception;
}
