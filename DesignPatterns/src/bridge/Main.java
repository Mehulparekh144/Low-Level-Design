package bridge;

import bridge.abstraction.AttendanceReport;
import bridge.abstraction.Report;
import bridge.implementor.CSVImplementor;
import bridge.implementor.PDFImplementor;
import bridge.implementor.ReportImplementor;

public class Main {
  public static void main(String[] args) {
    ReportImplementor pdfImplementor = new PDFImplementor();
    ReportImplementor csvImplementor = new CSVImplementor();

    Report attendanceReport = new AttendanceReport(csvImplementor);
    attendanceReport.generateReport();

    Report billingReport = new AttendanceReport(pdfImplementor);
    billingReport.generateReport();
  }
}
