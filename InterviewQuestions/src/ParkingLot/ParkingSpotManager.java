package ParkingLot;

import ParkingLot.parkingStrategy.ParkingStrategy;

import java.util.List;

public class ParkingSpotManager {

  private List<ParkingSpot> parkingSpotList;
  private ParkingStrategy parkingStrategy;

  public ParkingSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
    this.parkingSpotList = parkingSpotList;
    this.parkingStrategy = parkingStrategy;
  }

  public ParkingSpot findSpot() {
    return parkingStrategy.findSpot(parkingSpotList);
  }

  public void addParkingSpot(ParkingSpot parkingSpot) {
    parkingSpotList.add(parkingSpot);
  }

  public void freeSpot(String spotId){
    for(ParkingSpot parkingSpot : parkingSpotList) {
      if(parkingSpot.getSpotId().equals(spotId)) {
        parkingSpot.removeVehicle();
        break;
      }
    }
  }

}
