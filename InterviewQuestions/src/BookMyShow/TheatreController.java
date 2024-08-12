package BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
  Map<City, List<Theatre>> cityToTheatres;
  List<Theatre> allTheatres;

  public TheatreController(){
    cityToTheatres = new HashMap<>();
    allTheatres = new ArrayList<>();
  }

  public void add(City city,Theatre theatre){
    cityToTheatres.computeIfAbsent(city , k -> new ArrayList<>()).add(theatre);
    allTheatres.add(theatre);
  }

  Map<Theatre , List<Show>> getAllShow(Movie movie , City city){
    Map<Theatre , List<Show>> map = new HashMap<>();
    List<Theatre> theatres = cityToTheatres.get(city);

    for(Theatre theatre : theatres){
      List<Show> shows = theatre.getShows();
      List<Show> temp = new ArrayList<>();

      for(Show show : shows){
        if(show.getMovie().equals(movie)){
          temp.add(show);
        }
      }

      map.put(theatre , temp);
    }

    return map;
  }


}
