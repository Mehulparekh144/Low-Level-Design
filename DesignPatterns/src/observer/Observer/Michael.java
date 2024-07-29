package observer.Observer;

import observer.Observable.Employee;

import java.util.ArrayList;
import java.util.List;

public class Michael implements Boss{

  List<Employee> employeeList = new ArrayList<>();
  String policy;

  @Override
  public void add(Employee employee) {
    employeeList.add(employee);
  }

  @Override
  public void remove(Employee employee) {
    employeeList.remove(employee);
  }

  @Override
  public void notifyEmployee() {
    for(Employee employee : employeeList) {
      employee.update();
    }
  }

  @Override
  public void setPolicy(String policy) {
    if(!policy.equals(this.policy)){
      this.policy = policy;
      notifyEmployee();
    }
  }

  @Override
  public String getPolicy() {
    return policy;
  }
}
