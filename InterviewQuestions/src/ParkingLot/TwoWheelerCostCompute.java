package ParkingLot;

import ParkingLot.enums.PricingStrategyType;

public class TwoWheelerCostCompute extends CostComputation{

  public TwoWheelerCostCompute() {
    super(PricingStrategyType.HOURLY);
  }
}
