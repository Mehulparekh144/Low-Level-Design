package mediator;

import java.util.ArrayList;
import java.util.List;

public class MichaelMediator implements Mediator{

  List<Department> departments;

  public MichaelMediator(){
    departments = new ArrayList<>();
  }

  @Override
  public void addDepartments(Department department) {
    departments.add(department);
  }

  @Override
  public void sendMessage(Department department, String message) {
    for(Department department1 : departments){
      if(!department1.getName().equals(department.getName())){
        department1.receiveMessage(message);
      }
    }
  }
}
