package command;

/**
 * This is the receiver
 */
public class AirConditioner {

  private boolean isOn;
  private int temp;

  public AirConditioner(){
    isOn = false;
    temp = 0;
  }

  public void on(){
    isOn = true;
    System.out.println("Air Conditioner is on");
  }

  public void off(){
    isOn = false;
    System.out.println("Air Conditioner is off");
  }

  public void setTemp(int temp){
    this.temp = temp;
    System.out.println("Temperature is set to " + temp);
  }
}
