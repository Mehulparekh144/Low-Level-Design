package builder;

public class BeetFarmBuilder extends FarmBuilder{


  @Override
  public FarmBuilder setTemperature() {
    this.temperature = 30;
    return this;
  }
}
