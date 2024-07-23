package command;

public class TurnAcOffCommand implements ICommand{

  private final AirConditioner airConditioner;
  public TurnAcOffCommand(AirConditioner airConditioner){
    this.airConditioner = airConditioner;
  }

  @Override
  public void execute() {
    airConditioner.off();
  }

  @Override
  public void undo() {
    airConditioner.on();
  }
}
