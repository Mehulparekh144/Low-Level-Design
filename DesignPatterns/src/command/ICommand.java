package command;

/**
 * This is the invoker
 */
public interface ICommand{

  public void execute();
  public void undo();

}
