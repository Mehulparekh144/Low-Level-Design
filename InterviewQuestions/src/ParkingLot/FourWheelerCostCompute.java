package ParkingLot;

import ParkingLot.enums.PricingStrategyType;

public class FourWheelerCostCompute extends CostComputation{

  public FourWheelerCostCompute() {
    super(PricingStrategyType.MINUTE);
  }
}
