package BookMyShow;

import java.util.List;

public class Screen {
  private int id;
  List<Seat> seats;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<Seat> getSeats() {
    return seats;
  }

  public void setSeats(List<Seat> seats) {
    this.seats = seats;
  }
}
