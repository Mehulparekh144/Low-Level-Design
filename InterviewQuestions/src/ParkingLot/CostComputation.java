package ParkingLot;

import ParkingLot.enums.PricingStrategyType;

public class CostComputation {
  PricingStrategyType pricingStrategyType;

  public CostComputation(PricingStrategyType pricingStrategyType){
    this.pricingStrategyType = pricingStrategyType;
  }

  double computeCost(){
    return pricingStrategyType.getCost();
  }

}
