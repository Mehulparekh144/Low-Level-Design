package CarRentalSystem;

import CarRentalSystem.enums.Rate;

public class Bill {
  Reservation reservation;
  boolean isPaid;
  double amount;

  public Bill(Reservation reservation) {
    this.reservation = reservation;
    this.isPaid = false;
  }

  public double computeTotalCost(){
    long duration = Math.abs(reservation.getReturnDate().getTime() - reservation.getIssueDate().getTime());
    if(reservation.getRate().equals(Rate.HOURLY)){
      return duration * reservation.getVehicle().getHourlyRentalCost();
    } else {
      return (double) duration / (1000 * 60 * 60 * 24) * reservation.getVehicle().getDailyRentalCost();
    }
  }

}
