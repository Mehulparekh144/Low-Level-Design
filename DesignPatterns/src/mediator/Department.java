package mediator;

public interface Department {
  public void sendMessage(String message);
  public void receiveMessage(String message);
  public String getName();
}
