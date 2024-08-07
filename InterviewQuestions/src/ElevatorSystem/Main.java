package ElevatorSystem;

import ElevatorSystem.enums.Direction;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Floor> floors = new ArrayList<>();
    for(int i = 0; i < 10; i++){
      Floor floor = new Floor(i);
      floors.add(floor);
    }

    Building building = new Building(floors);

    ExternalButton externalButton = new ExternalButton();
    externalButton.submitExternalReq(5, Direction.UP);
    externalButton.submitExternalReq(4 , Direction.DOWN);

  }
}
