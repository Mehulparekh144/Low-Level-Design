package mediator;

public interface Mediator {
  public void addDepartments(Department department);
  public void sendMessage(Department department , String message);
}
