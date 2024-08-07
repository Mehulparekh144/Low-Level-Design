package ElevatorSystem;

import ElevatorSystem.enums.Direction;

import java.util.PriorityQueue;

public class ElevatorController {
  ElevatorCar car;
  PriorityQueue<Integer> upQueue;
  PriorityQueue<Integer> downQueue;

  public ElevatorController(ElevatorCar car) {
    this.car = car;
    upQueue = new PriorityQueue<>();
    downQueue = new PriorityQueue<>((a, b) -> b - a);
  }

  public void submitExternalReq(int floor , Direction direction){
    if(direction == Direction.UP){
      upQueue.add(floor);
    } else {
      downQueue.add(floor);
    }
  }

  public void controlElevator(){
    while(true){
      if(!upQueue.isEmpty()){
        int floor = upQueue.poll();
        car.move(floor, Direction.UP);
      } else if(!downQueue.isEmpty()){
        int floor = downQueue.poll();
        car.move(floor, Direction.DOWN);
      } else{
        break;
      }
    }
  }

}
