package CarRentalSystem;

import CarRentalSystem.enums.Rate;
import CarRentalSystem.enums.ReservationStatus;
import CarRentalSystem.enums.VehicleStatus;

import java.util.Date;

public class Reservation {
  private int reservationId;
  private User user;
  private Vehicle vehicle;
  private Date bookingDate;
  private Date issueDate;
  private Date returnDate;
  private Location location;
  private ReservationStatus status;
  private Rate rate;

  public Reservation createReservation(User user, Vehicle vehicle, Location location , Date issueDate , Date returnDate , Rate rate) {
    this.reservationId = new Date().toInstant().getNano();
    this.user = user;
    this.rate = rate;
    this.vehicle = vehicle;
    vehicle.setVehicleStatus(VehicleStatus.INACTIVE);
    this.issueDate = issueDate;
    this.returnDate = returnDate;
    this.location = location;
    this.bookingDate =  new Date();
    this.status = ReservationStatus.SCHEDULED;
    return this;
  }

  public void cancel() {
    this.status = ReservationStatus.CANCELLED;
  }

  public void close() {
    this.status = ReservationStatus.COMPLETED;
  }

  public void start(){
    this.status = ReservationStatus.IN_PROGRESS;
  }

  public int getReservationId() {
    return reservationId;
  }

  public void setReservationId(int reservationId) {
    this.reservationId = reservationId;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Rate getRate() {
    return rate;
  }

  public void setRate(Rate rate) {
    this.rate = rate;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Date getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(Date bookingDate) {
    this.bookingDate = bookingDate;
  }

  public Date getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(Date issueDate) {
    this.issueDate = issueDate;
  }

  public Date getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(Date returnDate) {
    this.returnDate = returnDate;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public ReservationStatus getStatus() {
    return status;
  }

  public void setStatus(ReservationStatus status) {
    this.status = status;
  }
}
