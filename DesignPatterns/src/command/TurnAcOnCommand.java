package command;

public class TurnAcOnCommand implements ICommand{

  private final AirConditioner airConditioner;

  public TurnAcOnCommand(AirConditioner airConditioner){
    this.airConditioner = airConditioner;
  }

  @Override
  public void execute() {
    airConditioner.on();
  }

  @Override
  public void undo() {
    airConditioner.off();
  }
}
