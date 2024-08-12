package BookMyShow;

import java.util.List;

public class Theatre {
  int id;
  City city;
  List<Screen> screens;
  List<Show> shows;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public List<Screen> getScreens() {
    return screens;
  }

  public void setScreens(List<Screen> screens) {
    this.screens = screens;
  }

  public List<Show> getShows() {
    return shows;
  }

  public void setShows(List<Show> shows) {
    this.shows = shows;
  }
}
