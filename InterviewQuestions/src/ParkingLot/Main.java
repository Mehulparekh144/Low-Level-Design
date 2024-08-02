package ParkingLot;

import ParkingLot.enums.VehicleType;

import java.util.Date;

/**
 * The Main class represents the entry point of the parking lot application.
 * It initializes the necessary objects and demonstrates the functionality of the parking lot system.
 */
public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the parking lot!");
    Vehicle bike = new Vehicle("B415" , VehicleType.TWO_WHEELER);
    VehicleType type = bike.getVehicleType();
    ParkingSpotManager spotManager = ParkingManagerFactory.getManager(type);

    EntranceGate gate = new EntranceGate(spotManager);
    Ticket ticket = gate.generateTicket(bike);

    if(ticket != null){
      System.out.println("Ticket generated successfully");
    }
    else{
      System.out.println("Ticket generation failed");
      return;
    }

    ticket.setExitTime(new Date());
    CostComputation costComputation = CostComputationFactory.getCostComputation(ticket.getVehicle().getVehicleType());
    ExitGate exitGate = new ExitGate(ticket , costComputation);
    System.out.println("Total Cost: " + exitGate.calculateCost());


  }
}
