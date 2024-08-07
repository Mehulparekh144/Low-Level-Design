package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {

  int[] rowCount ;
  int[] colCount;
  int diagCount;
  int revDiagCount;

  Deque<Player> players;
  Board board;

  public void init(){
    players = new LinkedList<>();

    players.offer(new Player("Mehul" , new PlayerPiece(PieceType.X)));
    players.offer(new Player("Rahul" , new PlayerPiece(PieceType.O)));

    board = new Board(3);

    rowCount = new int[board.size];
    colCount = new int[board.size];
    diagCount = 0;
    revDiagCount = 0;
  }

  public void play(){

    boolean noWinner = true;

    while(noWinner){
      Player playerTurn = players.pollFirst();

      board.print();
      List<int[]> freeSpaces = board.getFreeCells();

      if(freeSpaces.isEmpty()){
        noWinner = false;
        break;
      }

      System.out.println("Player " + playerTurn.name + " turn Enter row,column: ");
      Scanner inputScanner = new Scanner(System.in);
      String s = inputScanner.nextLine();
      String[] values = s.split(",");
      int row = Integer.parseInt(values[0]);
      int col = Integer.parseInt(values[1]);

      boolean isPlayed = board.play(row, col, playerTurn.playerPiece);
      if(!isPlayed){
        System.out.println("Invalid move");
        players.offerFirst(playerTurn);
        continue;
      }

      players.offerLast(playerTurn);
      if(isThereAWinner(row, col, playerTurn.playerPiece)){
        noWinner = false;
        board.print();
        System.out.println("Player " + playerTurn.name + " wins");
        return;
      }

    }

    System.out.println("TIE");

  }
//
//  private boolean isThereAWinner(int row , int col , PlayerPiece piece){
//    boolean rowMatch = true;
//    boolean colMatch = true;
//    boolean diagMatch = true;
//    boolean revDiagMatch = true;
//
//    PlayerPiece[][] b = board.board;
//
//    // Checking in row
//    for(int j = 0 ; j < board.size ; j++){
//      if(b[row][j] == null || b[row][j].pieceType != piece.pieceType){
//        rowMatch = false;
//        break;
//      }
//    }
//
//    // Checking in col
//    for(int i = 0 ; i < board.size ; i++){
//      if(b[i][col] == null || b[i][col].pieceType != piece.pieceType){
//        colMatch = false;
//        break;
//      }
//    }
//
//    //Checking in diagonal
//    for(int i = 0 ; i < board.size ; i++){
//      if(b[i][i] == null || b[i][i].pieceType != piece.pieceType){
//        diagMatch = false;
//        break;
//      }
//    }
//
//    //Checking in reverse diagonal
//    for(int i = 0 , j = board.size - 1 ; i < board.size ; i++ , j-- ){
//      if(b[i][j] == null || b[i][j].pieceType != piece.pieceType){
//        revDiagMatch = false;
//        break;
//      }
//    }
//
//    return rowMatch || colMatch || diagMatch || revDiagMatch;
//  }

  // O(1) TC
  public boolean isThereAWinner(int row , int col , PlayerPiece playerPiece){
    int piece = playerPiece.pieceType == PieceType.X ? 1 : -1;

    rowCount[row] += piece;
    colCount[col] += piece;

    if(row == col){
      diagCount += piece;
    }

    if(row + col == board.size - 1){
      revDiagCount += piece;
    }

    return Math.abs(rowCount[row]) == board.size || Math.abs(colCount[col]) == board.size || Math.abs(diagCount) == board.size || Math.abs(revDiagCount) == board.size;
  }
}
