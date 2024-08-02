package flyweight.without;

public class Character {
  char character;
  String font;
  int size;
  int row;
  int column;

  public Character(char character, String font, int size, int row, int color) {
    this.character = character;
    this.font = font;
    this.size = size;
    this.row = row;
    this.column = color;
  }
}
