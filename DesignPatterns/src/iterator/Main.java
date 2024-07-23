package iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(new Employee("Jim" , "Sales"));
    employeeList.add(new Employee("Dwight" , "Sales"));
    employeeList.add(new Employee("Michael" , "Management"));
    employeeList.add(new Employee("Pam" , "Reception"));
    employeeList.add(new Employee("Angela" , "Accounting"));

    StaffBook staffBook = new StaffBook(employeeList);
    Iterator iterator = staffBook.iterator();
    while(iterator.hasNext()){
      Employee employee = (Employee) iterator.next();
      System.out.println("Name: " + employee.getName() + " Department: " + employee.getDepartment());
    }
    System.out.println("-------------------- Sales Staff -------------------");
    SalesStaffBook salesStaffBook = new SalesStaffBook(employeeList);
    Iterator salesIterator = salesStaffBook.iterator();
    while(salesIterator.hasNext()){
      Employee employee = (Employee) salesIterator.next();
      System.out.println("Name: " + employee.getName() + " Department: " + employee.getDepartment());
    }
  }
}
