package flyweight.without;

public class Main {
  public static void main(String[] args) {

    /*
     * animal -> a is used twice this will create character object twice with only difference being in the position
     */

    Character character1 = new Character('a', "Arial", 12, 1, 1);
    Character character2 = new Character('n', "Arial", 12, 1, 2);
    Character character3 = new Character('i', "Arial", 12, 1, 3);
    Character character4 = new Character('m', "Arial", 12, 1, 4);
    Character character5 = new Character('a', "Arial", 12, 1, 5);
    Character character6 = new Character('l', "Arial", 12, 1, 6);

  }
}
