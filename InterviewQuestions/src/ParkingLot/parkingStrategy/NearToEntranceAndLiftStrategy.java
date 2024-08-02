package ParkingLot.parkingStrategy;

import ParkingLot.ParkingSpot;

import java.util.List;

public class NearToEntranceAndLiftStrategy implements ParkingStrategy{
  @Override
  public ParkingSpot findSpot(List<ParkingSpot> list) {
    for(ParkingSpot parkingSpot : list) {
      if(parkingSpot.isAvailable()) {
        return parkingSpot;
      }
    }
    return null;
  }
}
