package iterator;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class StaffBook implements Aggregate{

  List<Employee> employeeList;

  public StaffBook(List<Employee> employeeList) {
    this.employeeList = employeeList;
  }


  @Override
  public Iterator iterator() {
    return new StaffBookIterator(employeeList);
  }
}
