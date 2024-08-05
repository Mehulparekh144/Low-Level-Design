package CarRentalSystem;

import CarRentalSystem.enums.VehicleStatus;
import CarRentalSystem.enums.VehicleType;

public class Vehicle {
  private int id;
  private int vehicleNo;
  private VehicleType vehicleType;
  private VehicleStatus vehicleStatus;
  private int dailyRentalCost;
  private int hourlyRentalCost;

  public Vehicle(int id, int vehicleNo, VehicleType vehicleType, VehicleStatus vehicleStatus, int dailyRentalCost, int hourlyRentalCost) {
    this.id = id;
    this.vehicleNo = vehicleNo;

    this.vehicleType = vehicleType;
    this.vehicleStatus = vehicleStatus;
    this.dailyRentalCost = dailyRentalCost;
    this.hourlyRentalCost = hourlyRentalCost;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getVehicleNo() {
    return vehicleNo;
  }

  public void setVehicleNo(int vehicleNo) {
    this.vehicleNo = vehicleNo;
  }


  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public VehicleStatus getVehicleStatus() {
    return vehicleStatus;
  }

  public void setVehicleStatus(VehicleStatus vehicleStatus) {
    this.vehicleStatus = vehicleStatus;
  }

  public int getDailyRentalCost() {
    return dailyRentalCost;
  }

  public void setDailyRentalCost(int dailyRentalCost) {
    this.dailyRentalCost = dailyRentalCost;
  }

  public int getHourlyRentalCost() {
    return hourlyRentalCost;
  }

  public void setHourlyRentalCost(int hourlyRentalCost) {
    this.hourlyRentalCost = hourlyRentalCost;
  }

  @Override
  public String toString() {
    return "Vehicle{" +
        "id=" + id +
        ", vehicleNo=" + vehicleNo +
        ", vehicleType=" + vehicleType +
        ", vehicleStatus=" + vehicleStatus +
        ", dailyRentalCost=" + dailyRentalCost +
        ", hourlyRentalCost=" + hourlyRentalCost +
        '}';
  }
}
