package ElevatorSystem;

import java.util.List;

public class Building {
  List<Floor> floors;

  public Building(List<Floor> floors){
    this.floors = floors;
  }

  public List<Floor> getFloors(){
    return floors;
  }

  public void addFloors(Floor floor){
    floors.add(floor);
  }

  public void removeFloors(Floor floor){
    floors.remove(floor);
  }

}
