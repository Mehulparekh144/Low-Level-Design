package ElevatorSystem;

import ElevatorSystem.enums.Direction;

import java.util.ArrayList;
import java.util.List;

public class InternalButtonDispatcher {
  List<ElevatorController> elevatorControllers = ElevatorCreator.elevatorControllerList;

  public InternalButtonDispatcher() {
  }



  public void submitInternalReq(int floor , ElevatorCar elevatorCar) {
    elevatorControllers.get(elevatorCar.getId()).submitExternalReq(floor, elevatorCar.getDirection());
  }
}
