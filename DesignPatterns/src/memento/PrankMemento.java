package memento;

public class PrankMemento {

  private String prank;
  private int severity;

  public PrankMemento(String prank , int severity){
    this.prank = prank;
    this.severity = severity;
  }

  public int getSeverity() {
    return severity;
  }

  public void setSeverity(int severity) {
    this.severity = severity;
  }

  public String getPrank() {
    return prank;
  }

  public void setPrank(String prank) {
    this.prank = prank;
  }
}
