package ElevatorSystem;

import ElevatorSystem.enums.Direction;

public class Floor {
  int floor;
  ExternalButton externalButton;

  public Floor(int floor) {
    this.floor = floor;
    this.externalButton = new ExternalButton();
  }

  public void pressButton(Direction direction) {
    externalButton.submitExternalReq(floor, direction);
  }
}
