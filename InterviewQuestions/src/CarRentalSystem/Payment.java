package CarRentalSystem;

import CarRentalSystem.enums.VehicleStatus;

public class Payment {
  Bill bill;

  public Payment(Bill bill) {
    this.bill = bill;
  }

  public void makePayment(){
    System.out.println("Please pay $" + bill.computeTotalCost());
    bill.isPaid = true;
    bill.reservation.close();
    bill.reservation.getVehicle().setVehicleStatus(VehicleStatus.ACTIVE);
  }
}
