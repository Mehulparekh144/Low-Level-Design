package CarRentalSystem;

import CarRentalSystem.enums.Rate;
import CarRentalSystem.enums.VehicleStatus;
import CarRentalSystem.enums.VehicleType;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<User> users = generateUsers();
    List<Store> stores = generateStores();
    VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(users , stores);

    // Choosing first user
    User user = vehicleRentalSystem.users.getFirst();

    // Choosing first store
    Store store = vehicleRentalSystem.stores.getFirst();
    List<Vehicle> availableVehicles = store.getAvailableVehicles();

    System.out.println("Available vehicles in store : " + availableVehicles.size());
    System.out.println(availableVehicles);

    // Choosing first vehicle
    Vehicle vehicle = availableVehicles.getFirst();
    Location location = new Location("7 Forest Ave", "New York City", "New York" , "23001" , "USA");
    LocalDate issueDate = LocalDate.of(2024 , 8,  10);
    LocalDate returnDate = LocalDate.of(2024 , 8,  15);
    Date issueDate1 = Date.from(issueDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    Date returnDate1 = Date.from(returnDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    Reservation reservation = store.addReservation(vehicle, user , location ,issueDate1 , returnDate1 , Rate.DAILY);
    System.out.println("Reservation added successfully");

    System.out.println("Available vehicles in store : " + store.getAvailableVehicles().size());
    System.out.println(store.getAvailableVehicles());

    //Paying for the reservation
    Bill bill = new Bill(reservation);
    Payment payment = new Payment(bill);
    payment.makePayment();

    System.out.println(reservation.getStatus());
    System.out.println("Available vehicles in store : " + store.getAvailableVehicles().size());
    System.out.println(store.getAvailableVehicles());



  }

  private static List<User> generateUsers() {
    // Create a list of users
    List<User> users = new ArrayList<>();
    for(int i = 0 ; i < 10 ; i++){
      User user = new User(i , "user" + i , "user" + i + "123");
      users.add(user);
    }

    return users;
  }

  private static List<Store> generateStores() {
    List<Store> stores = new ArrayList<>();
    List<Vehicle> vehicles = new ArrayList<>();

    for(int i = 0 ; i < 5 ; i++){
      int randomNumber = (int)(Math.random() * (1000 - 1 + 1)) + 1;
      vehicles.add(new Vehicle(i , i + randomNumber , VehicleType.CAR , VehicleStatus.ACTIVE , 500 , 50 ));
    }

    for(int i = 0 ; i < 5 ; i++){
      int randomNumber = (int)(Math.random() * (1000 - 1 + 1)) + 1;
      vehicles.add(new Vehicle(i , i + randomNumber , VehicleType.BIKE , VehicleStatus.ACTIVE , 200 , 20 ));
    }

    VehicleInventoryMgmt vehicleInventoryMgmt = new VehicleInventoryMgmt(vehicles);
    for(int i = 0 ; i < 10 ; i++){
      Store store = new Store();
      store.setVehicleInventoryMgmt(vehicleInventoryMgmt);
      stores.add(store);
    }


    return stores;
  }
}
