package ParkingLot.enums;

public enum PricingStrategyType {

  HOURLY(30),
  MINUTE(10);

  private final int cost;

  PricingStrategyType(int cost) {
    this.cost = cost;
  }

  public int getCost() {
    return cost;
  }


}
