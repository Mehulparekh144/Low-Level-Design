package bridge.implementor;

public class CSVImplementor implements ReportImplementor{
  @Override
  public void generate() {
    System.out.println("Generating CSV report");
  }
}
