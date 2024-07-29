package bridge.abstraction;

import bridge.implementor.ReportImplementor;

public class BillingReport extends Report{

  public BillingReport(ReportImplementor reportImplementor) {
    super(reportImplementor);
  }

  @Override
  public void generateReport() {
    reportImplementor.generate();
  }
}
