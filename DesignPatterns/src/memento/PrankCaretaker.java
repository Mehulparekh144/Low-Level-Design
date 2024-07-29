package memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrankCaretaker {
  Stack<PrankMemento> pranks;

  public PrankCaretaker(){
    this.pranks = new Stack<>();
  }

  public void add(PrankMemento memento){
    pranks.push(memento);
  }

  public PrankMemento undo(){
    if(pranks.isEmpty()){
      throw new IllegalStateException("No pranks to undo");
    }
    return pranks.pop();
  }
}
