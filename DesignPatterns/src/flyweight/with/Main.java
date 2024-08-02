package flyweight.with;

public class Main {
  public static void main(String[] args) {
    Character a = CharacterFactory.create('a');
    a.display(1,0);
    Character n = CharacterFactory.create('n');
    n.display(1,1);
    Character i = CharacterFactory.create('i');
    i.display(1,2);
    Character m = CharacterFactory.create('m');
    m.display(1,3);
    Character a2 = CharacterFactory.create('a');
    a2.display(1,4);
    Character l = CharacterFactory.create('l');
    l.display(1,5);
  }
}
