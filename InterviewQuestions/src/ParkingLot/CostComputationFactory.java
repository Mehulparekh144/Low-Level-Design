package ParkingLot;

import ParkingLot.enums.VehicleType;

public class CostComputationFactory {

  public static CostComputation getCostComputation(VehicleType type){
    return switch (type){
      case TWO_WHEELER -> new TwoWheelerCostCompute();
      case FOUR_WHEELER -> new FourWheelerCostCompute();
      default -> null;
    };
  }
}
