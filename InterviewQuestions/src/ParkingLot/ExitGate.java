package ParkingLot;

public class ExitGate {
  private final CostComputation costComputation;
  private final Ticket ticket;

  public ExitGate(Ticket ticket, CostComputation costComputation){
    this.ticket = ticket;
    this.costComputation = costComputation;
  }

  public double calculateCost(){
    return ticket.calculateDuration() * costComputation.computeCost();
  }

}
