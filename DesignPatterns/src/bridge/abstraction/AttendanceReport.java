package bridge.abstraction;

import bridge.implementor.ReportImplementor;

public class AttendanceReport extends Report{


  public AttendanceReport(ReportImplementor reportImplementor) {
    super(reportImplementor);
  }

  @Override
  public void generateReport() {
   reportImplementor.generate();
  }
}
