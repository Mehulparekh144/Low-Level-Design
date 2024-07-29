package mediator;

public class Client {
  public static void main(String[] args) {
    Mediator mediator = new MichaelMediator();
    Department sales = new Sales(mediator , "Jim");
    Department accounting = new Accounting(mediator , "Angela");

    sales.sendMessage("Please give the billing details of client XYZ");
    accounting.sendMessage("Wait for sometime");

  }
}
