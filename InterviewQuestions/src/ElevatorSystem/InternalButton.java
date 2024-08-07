package ElevatorSystem;

public class InternalButton {
  private InternalButtonDispatcher dispatcher = new InternalButtonDispatcher();

  int[] buttons = {1,2,3,4,5,6,7,8,9,10};
  int buttonSelected;

  void pressButton(int destination  , ElevatorCar elevatorCar){
    if(destination < 1 || destination > 10){
      System.out.println("Invalid floor selected");
      return;
    }

    if(buttonSelected == destination){
      System.out.println("Already on the same floor");
      return;
    }

    buttonSelected = destination;
    dispatcher.submitInternalReq(buttonSelected , elevatorCar);
  }

}
