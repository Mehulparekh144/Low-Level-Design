package ElevatorSystem;

import ElevatorSystem.enums.Direction;

import java.util.List;

public class ExternalButton {
  List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

  public ExternalButton() {
  }

  public void submitExternalReq(int floor, Direction direction) {
    for(ElevatorController elevatorController : elevatorControllerList){

      int elevatorId = elevatorController.car.getId();
      if(elevatorId%2 == 1 && floor%2 == 1){
        elevatorController.submitExternalReq(floor, direction);
      } else if(elevatorId%2 == 0 && floor%2 == 0){
        elevatorController.submitExternalReq(floor, direction);
      }
    }
  }
}
