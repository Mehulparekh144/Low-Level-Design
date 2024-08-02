package ParkingLot;

import ParkingLot.enums.SpotType;
import ParkingLot.parkingStrategy.NearToEntranceStrategy;
import ParkingLot.parkingStrategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{

  private static final List<ParkingSpot> parkingSpotList = new ArrayList<>();
  private static final ParkingStrategy parkingStrategy = new NearToEntranceStrategy();

  public TwoWheelerParkingSpotManager() {
    super(parkingSpotList, parkingStrategy);
    for (int i = 0; i < 600; i++) {
      parkingSpotList.add(new ParkingSpot("TW" + i , SpotType.TWO_WHEELER)); // Assuming ParkingSpot has a default constructor
    }
  }
}
