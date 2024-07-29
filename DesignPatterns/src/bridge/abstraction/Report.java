package bridge.abstraction;

import bridge.implementor.ReportImplementor;

public abstract class Report {

  ReportImplementor reportImplementor;
  public Report(ReportImplementor reportImplementor) {
    this.reportImplementor = reportImplementor;
  }

  public abstract void generateReport();
}
