package command;

import java.util.Stack;

public class Remote {

  private ICommand command;
  private final Stack<ICommand> history;

  public Remote(){
    history = new Stack<>();
  }

  public void setCommand(ICommand command){
    this.command = command;
  }

  public void pressButton(){
    command.execute();
    history.add(command);
  }

  public void pressUndo(){

    if(history.isEmpty()){
      System.out.println("No command to undo");
      return;
    }

    ICommand lastCommand = history.pop();
    lastCommand.undo();
  }

}
