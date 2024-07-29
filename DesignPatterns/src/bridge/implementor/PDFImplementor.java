package bridge.implementor;

public class PDFImplementor implements ReportImplementor{


  @Override
  public void generate() {
    System.out.println("Generating PDF report");
  }
}
