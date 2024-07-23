package objectpool;

public class OfficeSupply {
  private String name;

  public OfficeSupply(String name) {
    this.name = name;
  }

  public String getName() {
    return name +" being used.";
  }
}
