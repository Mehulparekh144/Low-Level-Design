package builder;

public class WheatFarmBuilder extends FarmBuilder{

  @Override
  public FarmBuilder setTemperature() {
    this.temperature = 20;
    return this;
  }
}
