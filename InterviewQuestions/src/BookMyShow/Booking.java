package BookMyShow;

import java.util.List;

public class Booking {
  Show show;
  List<Seat> bookedSeats;
  double amount;

  public Show getShow() {
    return show;
  }

  public void setShow(Show show) {
    this.show = show;
  }

  public List<Seat> getBookedSeats() {
    return bookedSeats;
  }

  public void setBookedSeats(List<Seat> bookedSeats) {
    this.bookedSeats = bookedSeats;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }
}
