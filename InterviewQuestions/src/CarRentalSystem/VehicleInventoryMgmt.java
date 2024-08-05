package CarRentalSystem;

import java.util.List;

public class VehicleInventoryMgmt {
  List<Vehicle> vehicles;

  public VehicleInventoryMgmt(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  public List<Vehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }
}
