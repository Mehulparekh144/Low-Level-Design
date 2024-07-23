package command;

public class Main {

  public static void main(String[] args) {
    AirConditioner airConditioner = new AirConditioner();
    TurnAcOnCommand turnAcOnCommand = new TurnAcOnCommand(airConditioner);
    TurnAcOffCommand turnAcOffCommand = new TurnAcOffCommand(airConditioner);
    Remote remote = new Remote();
    remote.setCommand(turnAcOnCommand);
    remote.pressButton();
    remote.pressUndo();
  }
}
