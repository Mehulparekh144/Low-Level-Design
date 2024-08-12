package BookMyShow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {
  MovieController movieController;
  TheatreController theatreController;

  public BookMyShow(){
    movieController = new MovieController();
    theatreController = new TheatreController();
  }

  public static void main(String[] args) {
    BookMyShow bookMyShow = new BookMyShow();
    bookMyShow.initialize();

    bookMyShow.createBooking(City.DELHI , "Avengers");
    bookMyShow.createBooking(City.DELHI , "Avengers");
  }

  public void initialize(){
    initializeMovies();
    initializeTheatres();
  }

  public void createBooking(City userCity , String movieName){
    List<Movie> movies = movieController.getMoviesByCity(userCity);

    Movie movie = null;
    for(Movie m : movies){
      if(m.getName().equals(movieName)){
        movie = m;
        break;
      }
    }

    if(movie == null){
      System.out.println("Movie not found in " + userCity);
      return;
    }

    Map<Theatre,List<Show>> shows = theatreController.getAllShow(movie , userCity);


    Map.Entry<Theatre , List<Show>> entry = shows.entrySet().iterator().next();
    List<Show> runningShows = entry.getValue();
    Show interestedShow = runningShows.getFirst();

    int seatNumber = 30;
    List<Integer> bookedSeats = interestedShow.getBookedSeatIds();

    if(!bookedSeats.contains(seatNumber)){
      bookedSeats.add(seatNumber);
      interestedShow.setBookedSeatIds(bookedSeats);

      Booking booking = new Booking();
      List<Seat> myBookedSeats = new ArrayList<>();

      for(Seat seat : interestedShow.getScreen().getSeats()){
        if(seat.getId() == seatNumber){
          myBookedSeats.add(seat);
        }
      }

      booking.setBookedSeats(myBookedSeats);
      booking.setShow(interestedShow);
      booking.setAmount(myBookedSeats.stream().mapToDouble(Seat::getPrice).sum());
      System.out.println("Booking successful for " + movieName + " in " + userCity + " at " + interestedShow.getStartTime() + " with amount " + booking.getAmount());

    } else{
      System.out.println("Seat already booked");
      return;
    }
  }

  private  void initializeMovies(){
    Movie movie = new Movie();
    movie.setName("Avengers");
    movie.setDuration(180);
    movie.setId(1);

    Movie movie1 = new Movie();
    movie1.setName("Joker");
    movie1.setDuration(120);
    movie1.setId(2);

    Movie movie2 = new Movie();
    movie2.setName("Inception");
    movie2.setDuration(150);
    movie2.setId(3);

    Movie movie3 = new Movie();
    movie3.setName("Interstellar");
    movie3.setDuration(180);
    movie3.setId(4);

    movieController.addMovie(City.DELHI, movie);
    movieController.addMovie(City.BANGALORE, movie1);
    movieController.addMovie(City.MUMBAI, movie2);
    movieController.addMovie(City.DELHI, movie3);
  }

  private  void initializeTheatres(){

    Movie avengers = movieController.getMovieByName("Avengers");
    Movie joker = movieController.getMovieByName("Interstellar");

    Theatre theatre1 = new Theatre();
    theatre1.setId(1);
    theatre1.setCity(City.DELHI);
    theatre1.setScreens(createScreens());

    List<Show> shows = new ArrayList<>();
    shows.add(new Show(1 , avengers , 9 , new ArrayList<>() , theatre1.getScreens().getFirst() ));
    shows.add(new Show(2 , joker , 13 , new ArrayList<>() , theatre1.getScreens().getFirst() ));
    theatre1.setShows(shows);

    theatreController.add(City.DELHI , theatre1);

  }

  private List<Screen> createScreens(){
    List<Screen> screens = new ArrayList<>();
    Screen screen = new Screen();
    screen.setId(1);
    screen.setSeats(initializeSeats());
    screens.add(screen);
    return screens;
  }


  private List<Seat> initializeSeats(){
    List<Seat> seats = new ArrayList<>();

    for(int i = 0 ; i < 40 ; i++){
      Seat seat = new Seat();
      seat.setId(i);
      seat.setCategory(SeatCategory.SILVER);
      seat.setPrice(200);
      seats.add(seat);
    }

    for(int i = 41 ; i < 90 ; i++){
      Seat seat = new Seat();
      seat.setId(i);
      seat.setCategory(SeatCategory.PLATINUM);
      seat.setPrice(400);
      seats.add(seat);
    }

    for(int i = 91 ; i < 101 ; i++){
      Seat seat = new Seat();
      seat.setId(i);
      seat.setCategory(SeatCategory.GOLD);
      seat.setPrice(1000);
      seats.add(seat);
    }

    return seats;
  }

}
