package CarRentalSystem;

import CarRentalSystem.enums.Rate;
import CarRentalSystem.enums.ReservationStatus;
import CarRentalSystem.enums.VehicleStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Store {
  private int storeId;
  VehicleInventoryMgmt vehicleInventoryMgmt;
  List<Reservation> reservations = new ArrayList<>();
  Location location;

  public void setVehicleInventoryMgmt(VehicleInventoryMgmt vehicleInventoryMgmt) {
    this.vehicleInventoryMgmt = vehicleInventoryMgmt;
  }

  public void addVehicle(Vehicle vehicle) {
    vehicleInventoryMgmt.getVehicles().add(vehicle);
  }

  public List<Vehicle> getAvailableVehicles() {
    List<Vehicle> vehicles = vehicleInventoryMgmt.getVehicles();
    return vehicles.stream().filter(vehicle -> vehicle.getVehicleStatus() == VehicleStatus.ACTIVE).toList();
  }

  public Reservation addReservation(Vehicle vehicle , User user , Location location , Date issueDate , Date returnDate , Rate rate) {
    Reservation reservation = new Reservation();
    reservation.createReservation(user, vehicle, location, issueDate, returnDate , rate);
    vehicleInventoryMgmt.getVehicles().remove(vehicle);
    reservations.add(reservation);
    return reservation;
  }

  public void cancelReservation(Reservation reservation) {
    if(!reservations.contains(reservation)){
      throw new IllegalArgumentException("Reservation does not exist");
    }

    reservations.remove(reservation);
    reservation.cancel();
  }

  public void closeReservation(Reservation reservation) {
    if(reservation.getStatus() == ReservationStatus.COMPLETED || reservation.getStatus() == ReservationStatus.CANCELLED){
      throw new IllegalArgumentException("Reservation is already closed/cancelled");
    }
    if(!reservations.contains(reservation)){
      throw new IllegalArgumentException("Reservation does not exist");
    }

    reservations.remove(reservation);
    reservation.close();
  }


}
