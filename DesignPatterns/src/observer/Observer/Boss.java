package observer.Observer;

import observer.Observable.Employee;

public interface Boss {
  void add(Employee employee);
  void remove(Employee employee);
  void notifyEmployee();
  void setPolicy(String policy);

  String getPolicy();
}
