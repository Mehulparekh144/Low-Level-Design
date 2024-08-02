package ParkingLot.parkingStrategy;

import ParkingLot.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {
  ParkingSpot findSpot(List<ParkingSpot> list);
}
