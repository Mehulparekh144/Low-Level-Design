package BookMyShow;

import java.util.List;

public class Show {
  private int id;
  private Movie movie;
  private int startTime;
  List<Integer> bookedSeatIds;
  Screen screen;

  public Show(int id, Movie movie, int startTime, List<Integer> bookedSeatIds, Screen screen) {
    this.id = id;
    this.movie = movie;
    this.startTime = startTime;
    this.bookedSeatIds = bookedSeatIds;
    this.screen = screen;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }

  public int getStartTime() {
    return startTime;
  }



  public Screen getScreen() {
    return screen;
  }

  public void setScreen(Screen screen) {
    this.screen = screen;
  }

  public void setStartTime(int startTime) {
    this.startTime = startTime;
  }

  public List<Integer> getBookedSeatIds() {
    return bookedSeatIds;
  }

  public void setBookedSeatIds(List<Integer> bookedSeatIds) {
    this.bookedSeatIds = bookedSeatIds;
  }
}
