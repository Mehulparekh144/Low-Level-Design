package iterator;

import java.util.List;

public class SalesStaffBook implements Aggregate{
  List<Employee> employeeList;

  public SalesStaffBook(List<Employee> employeeList) {
    this.employeeList = employeeList;
  }


  @Override
  public Iterator iterator() {
    List<Employee> salesEmployees = employeeList.stream().filter(employee -> employee.getDepartment().
        equals("Sales")).toList();
    return new StaffBookIterator(salesEmployees);
  }
}
