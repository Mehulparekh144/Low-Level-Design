package ParkingLot;

import ParkingLot.enums.SpotType;
import ParkingLot.parkingStrategy.NearToEntranceAndLiftStrategy;
import ParkingLot.parkingStrategy.NearToEntranceStrategy;
import ParkingLot.parkingStrategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{

  private static final List<ParkingSpot> parkingSpotList = new ArrayList<>();
  private static final ParkingStrategy parkingStrategy = new NearToEntranceAndLiftStrategy();

  public FourWheelerParkingSpotManager() {
    super(parkingSpotList, parkingStrategy);
    for (int i = 0; i < 400; i++) {
      parkingSpotList.add(new ParkingSpot("FW" + i , SpotType.FOUR_WHEELER)); // Assuming ParkingSpot has a default constructor
    }
  }
}
