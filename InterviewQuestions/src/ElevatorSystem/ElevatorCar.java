package ElevatorSystem;

import ElevatorSystem.enums.Direction;
import ElevatorSystem.enums.Status;

public class ElevatorCar {
  private int id;
  private int currFloor;
  private Status status;
  private Direction direction;
  private Display display;
  private InternalButton button;

  public ElevatorCar(){
    display = new Display();
    button = new InternalButton();
    status = Status.IDLE;
    direction = Direction.UP;
    currFloor = 0;
  }

  public void showDisplay(){
    display.showDisplay();
  }

  public void pressButton(int floor){
    button.pressButton(floor , this);
  }



  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getCurrFloor() {
    return currFloor;
  }

  public void setCurrFloor(int currFloor) {
    this.currFloor = currFloor;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Direction getDirection() {
    return direction;
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  public Display getDisplay() {
    return display;
  }

  public void setDisplay() {
    this.display.setDisplay(currFloor , direction);
  }

  public void move(int floor , Direction dir){
    int start = currFloor;

    if(dir == Direction.UP){
      while(currFloor < floor){
        currFloor++;
        setDisplay();
        showDisplay();
      }
    } else {
      while(currFloor > floor){
        currFloor--;
        setDisplay();
        showDisplay();
      }
    }
  }
}
