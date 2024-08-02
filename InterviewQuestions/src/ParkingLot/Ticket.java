package ParkingLot;

import java.util.Date;

public class Ticket {
   private String ticketId;

  private Vehicle vehicle;
   private ParkingSpot spot;
   private Date entryTime;
    private Date exitTime;

    public Ticket(String ticketId, Vehicle vehicle, ParkingSpot spot, Date entryTime) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = entryTime;
    }

  public Vehicle getVehicle() {
    return vehicle;
  }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public long calculateDuration(){
      return (exitTime.getTime() - entryTime.getTime())/1000;
    }
}
