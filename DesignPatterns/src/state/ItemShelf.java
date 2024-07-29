package state;

public class ItemShelf {
  int code;
  Item item;
  boolean isAvailable;

  public ItemShelf() {
  }

  public ItemShelf(int code, Item item) {
    this.code = code;
    this.item = item;
    this.isAvailable = true;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean available) {
    isAvailable = available;
  }
}
