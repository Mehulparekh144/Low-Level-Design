package SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
  public Cell[][] board;

  Board(int boardSize , int snakes , int ladders){
    initializeCells(boardSize);
    addSnakesLadders(board , snakes , ladders);
  }

  private void addSnakesLadders(Cell[][] board, int snakes, int ladders) {
    while(snakes > 0){
      int snakeHead = ThreadLocalRandom.current().nextInt(1 , board.length*board.length-1);
      int snakeTail = ThreadLocalRandom.current().nextInt(1 , board.length*board.length-1);

      if(snakeTail >= snakeHead) continue;

      Jump snakeObj = new Jump();
      snakeObj.start = snakeHead;
      snakeObj.end = snakeTail;

      Cell cell = getCell(snakeHead);
      cell.jump = snakeObj;

      snakes--;
    }

    while(ladders > 0){
      int ladderHead = ThreadLocalRandom.current().nextInt(1 , board.length*board.length-1);
      int ladderTail = ThreadLocalRandom.current().nextInt(1 , board.length*board.length-1);

      if(ladderTail <= ladderHead) continue;

      Jump snakeObj = new Jump();
      snakeObj.start = ladderHead;
      snakeObj.end = ladderTail;

      Cell cell = getCell(ladderHead);
      cell.jump = snakeObj;

      ladders--;
    }

  }

  public Cell getCell(int pos){
    int boardRow = pos/board.length;
    int boardCol = pos%board.length;
    return board[boardRow][boardCol];
  }

  private void initializeCells(int boardSize){
    board = new Cell[boardSize][boardSize];

    for(int i = 0 ; i < boardSize; i++){
      for(int j = 0 ; j  < boardSize ; j++){
        board[i][j] = new Cell();
      }
    }
  }
}
