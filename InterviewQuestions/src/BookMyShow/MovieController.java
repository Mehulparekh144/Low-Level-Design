package BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
  Map<City, List<Movie>> cityToMovies;
  List<Movie> movies;

  public MovieController(){
    cityToMovies = new HashMap<>();
    movies = new ArrayList<>();
  }

  public void addMovie(City city,Movie movie){
    cityToMovies.computeIfAbsent(city , k -> new ArrayList<>()).add(movie);
    movies.add(movie);
  }

  public List<Movie> getMoviesByCity(City city){
    return cityToMovies.get(city);
  }

  public Movie getMovieByName(String name){
    for(Movie movie : movies){
      if(movie.getName().equals(name)){
        return movie;
      }
    }
    return null;
  }
}
