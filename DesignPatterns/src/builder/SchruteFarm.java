package builder;

public class SchruteFarm {

  private final String crop;
  private final String animal;
  private final String owner;
  private final int temperature;

  public SchruteFarm(FarmBuilder builder){
    this.crop = builder.crop;
    this.animal = builder.animal;
    this.owner = builder.owner;
    this.temperature = builder.temperature;
  }

  @Override
  public String toString() {
    return crop + " " + animal + " " + owner + " " + temperature;
  }
}
