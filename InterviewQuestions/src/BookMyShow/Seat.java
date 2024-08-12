package BookMyShow;

public class Seat {
  private int id;
  private int row;
  private SeatCategory category;
  private int price;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getRow() {
    return row;
  }

  public void setRow(int row) {
    this.row = row;
  }

  public SeatCategory getCategory() {
    return category;
  }

  public void setCategory(SeatCategory category) {
    this.category = category;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
