package ElevatorSystem;
import java.util.List;
import java.util.ArrayList;

public class ElevatorCreator {

  static List<ElevatorController> elevatorControllerList = new ArrayList<>();

  static {
    for(int i = 0; i < 2; i++){
      ElevatorCar car = new ElevatorCar();
      car.setId(i);
      ElevatorController elevatorController = new ElevatorController(car);
      elevatorControllerList.add(elevatorController);
    }
  }
}
