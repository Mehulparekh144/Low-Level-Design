package flyweight.with;

public class DocumentCharacter implements Character {

  private final char character;
  private final String type;
  private final int size;

  public DocumentCharacter(char character, String type, int size) {
    this.character = character;
    this.type = type;
    this.size = size;
  }

  public char getCharacter() {
    return character;
  }

  public String getType() {
    return type;
  }

  public int getSize() {
    return size;
  }


  @Override
  public void display(int row, int col) {
    System.out.println("Character: " + character + " Type: " + type + " Size: " + size + " Row: " + row + " Col: " + col);
  }
}
