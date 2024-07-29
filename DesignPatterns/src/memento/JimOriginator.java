package memento;

public class JimOriginator {
  private String prank;
  private int severity;

  public JimOriginator(String prank , int severity){
    this.prank = prank;
    this.severity = severity;
  }

  public PrankMemento create(){
    return new PrankMemento(prank , severity);
  }

  public void restore(PrankMemento memento){
    this.prank = memento.getPrank();
    this.severity = memento.getSeverity();
  }

  public String getPrank() {
    return prank;
  }

  public int getSeverity() {
    return severity;
  }

  public void setPrank(String s) {
    this.prank = s;
  }

  public void setSeverity(int i) {
    this.severity = i;
  }
}
