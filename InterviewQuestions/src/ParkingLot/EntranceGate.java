package ParkingLot;

import java.util.Date;

public class EntranceGate {
   ParkingSpotManager spotManager;

   public EntranceGate(ParkingSpotManager spotManager){
     this.spotManager = spotManager;
   }

   public Ticket generateTicket(Vehicle vehicle){
     ParkingSpot spot = spotManager.findSpot();
     if(spot == null){
       System.out.println("Parking full");
       return null;
     }

     spot.parkVehicle(vehicle);

     return new Ticket(vehicle.getVehicleNo(), vehicle, spot, new Date());
   }


}
