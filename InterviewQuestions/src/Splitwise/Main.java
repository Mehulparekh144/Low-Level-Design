package Splitwise;

public class Main {
  public static void main(String[] args) {
    Splitwise splitwise = new Splitwise();
//    splitwise.demo();
    int[][] transactions = {
      {0, 1, 100},
      {1, 2, 50},
      {1, 3, 50},
      {2, 3, 50},
    };
    System.out.println(splitwise.minTransfer(transactions));
  }
}
