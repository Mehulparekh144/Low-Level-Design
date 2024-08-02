package ParkingLot;

import ParkingLot.enums.SpotType;

public class ParkingSpot {
  private String spotId;
  private boolean isOccupied;
  private Vehicle vehicle;
  private SpotType spotType;

  public ParkingSpot(String spotId, SpotType spotType) {
    this.spotId = spotId;
    this.spotType = spotType;
    this.isOccupied = false;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public String getSpotId() {
    return spotId;
  }

  public SpotType getSpotType() {
    return spotType;
  }

  public boolean isAvailable() {
    return !isOccupied;
  }

  public void parkVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    this.isOccupied = true;
  }

  public void removeVehicle() {
    this.vehicle = null;
    this.isOccupied = false;
  }
}
