package SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
  Board board;
  Dice dice;
  Deque<Player> players;
  Player winner;

  public Game(){
    initializeGame();
  }

  private void initializeGame() {
    board = new Board(10 , 4,4);
    dice = new Dice(1);
    winner = null;
    players = new LinkedList<>();
    players.offer(new Player("Red" , 0));
    players.offer(new Player("Blue" , 0));
  }

  public void startGame(){
    while(winner == null){
      Player playerTurn = getPlayerTurn();
      System.out.println(playerTurn.id + " playing and current position is " + playerTurn.currentPosition);

      int diceNumber = dice.rollDice();

      int playerNewPosition = playerTurn.currentPosition + diceNumber;
      playerNewPosition = checkJump(playerNewPosition);
      playerTurn.currentPosition = playerNewPosition;
      System.out.println(playerTurn.id + " playing and new position is " + playerTurn.currentPosition);

      if(playerNewPosition >= board.board.length*board.board.length - 1){
        winner = playerTurn;
      }

    }

    System.out.println(winner.id + " wins");
  }

  private int checkJump(int playerNewPosition) {
    if(playerNewPosition > board.board.length*board.board.length-1){
      return playerNewPosition;
    }
    Cell cell = board.getCell(playerNewPosition);

    if(cell.jump != null && cell.jump.start == playerNewPosition){
      String jumpyBy = cell.jump.start < cell.jump.end ? "Ladder" : "Snake";
      System.out.println("Jump by " + jumpyBy);
      return cell.jump.end;
    }
    return playerNewPosition;
  }

  private Player getPlayerTurn() {
    Player player = players.pollFirst();
    players.offerLast(player);
    return player;
  }

  public static void main(String[] args) {
    Game game = new Game();
    game.startGame();
  }
}
