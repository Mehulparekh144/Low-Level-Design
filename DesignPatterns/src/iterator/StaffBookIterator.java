package iterator;


import java.util.List;
import java.util.NoSuchElementException;

public class StaffBookIterator implements Iterator {

  private List<Employee> employeeList;
  private int idx = 0;

  public StaffBookIterator(List<Employee> employeeList) {
    this.employeeList = employeeList;
  }

  @Override
  public boolean hasNext() {
    return idx < employeeList.size();
  }

  @Override
  public Object next() {
    if(this.hasNext()){
      return employeeList.get(idx++);
    }
    throw new NoSuchElementException();
  }
}
