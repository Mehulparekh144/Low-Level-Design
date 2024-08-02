package ParkingLot;

import ParkingLot.enums.SpotType;
import ParkingLot.enums.VehicleType;

public class ParkingManagerFactory {

  static ParkingSpotManager  getManager(VehicleType type){
    return switch (type){
      case TWO_WHEELER -> new TwoWheelerParkingSpotManager();
      case FOUR_WHEELER -> new FourWheelerParkingSpotManager();
      default -> null;
    };
  }
}
