package builder;

public abstract class FarmBuilder {
  String crop;
  String animal;
  String owner;
  int temperature;

  public FarmBuilder setCrop(String crop) {
    this.crop = crop;
    return this;
  }

  public FarmBuilder setAnimal(String animal) {
    this.animal = animal;
    return this;
  }

  public FarmBuilder setOwner(String owner) {
    this.owner = owner;
    return this;
  }
  
  public abstract FarmBuilder setTemperature() ;

  public SchruteFarm build() {
    return new SchruteFarm(this);
  }
}
