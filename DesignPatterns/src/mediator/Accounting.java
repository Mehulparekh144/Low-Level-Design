package mediator;

public class Accounting implements Department{

  Mediator mediator;
  String name;

  public Accounting(Mediator mediator , String name){
    this.name = name;
    this.mediator = mediator;
    mediator.addDepartments(this);
  }


  @Override
  public void sendMessage(String message) {
    mediator.sendMessage(this , "(" +  this.name + ")" + message);
  }

  @Override
  public void receiveMessage(String message) {
    System.out.println(name + " got message : " + message );
  }

  @Override
  public String getName() {
    return this.name;
  }
}
