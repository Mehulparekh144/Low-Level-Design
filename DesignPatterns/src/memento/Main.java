package memento;

public class Main {
  public static void main(String[] args) {
    JimOriginator jim = new JimOriginator("Put a whoopee cushion on the boss's chair", 5);
    PrankCaretaker caretaker = new PrankCaretaker();
    caretaker.add(jim.create());
    System.out.println("Jim's prank: " + jim.getPrank());

    jim.setPrank("Put dwight's stapler in jello");
    jim.setSeverity(10);
    caretaker.add(jim.create());
    System.out.println("Jim's prank: " + jim.getPrank());

    jim.setPrank("Put dwight's desk in the bathroom");
    jim.setSeverity(6);
    System.out.println("Jim's prank: " + jim.getPrank());


    System.out.println("Undoing Jim's prank");
    jim.restore(caretaker.undo());
    System.out.println("Jim's prank: " + jim.getPrank());

    jim.restore(caretaker.undo());
    System.out.println("Jim's prank: " + jim.getPrank());
  }
}
