package TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
  int size;
  PlayerPiece[][] board;

  public Board(int size) {
    this.size = size;
    this.board = new PlayerPiece[size][size];
  }

  public boolean play(int row , int col , PlayerPiece piece){
    if(board[row][col] != null) return false;
    board[row][col] =  piece;
    return true;
  }

  public List<int[]> getFreeCells(){
    List<int[]> freeCells = new ArrayList<>();

    for(int i = 0 ; i < size ; i++){
      for(int j = 0 ; j < size ; j++){
        if(board[i][j] == null){
          freeCells.add(new int[]{i , j});
        }
      }
    }

    return freeCells;
  }
  public void print() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (board[i][j] == null) {
          System.out.print("-");
        } else {
          System.out.print(board[i][j].pieceType.toString());
        }
        if (j < size - 1) {
          System.out.print(" | ");
        }
      }
      System.out.println();
      if (i < size - 1) {
        System.out.println("---------");
      }
    }
  }
}
