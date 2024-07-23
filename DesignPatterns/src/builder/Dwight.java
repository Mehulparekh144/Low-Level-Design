package builder;

public class Dwight {

  private final FarmBuilder farmBuilder;

  public Dwight(FarmBuilder farmBuilder){
    this.farmBuilder = farmBuilder;
  }

  public SchruteFarm createFarm(String owner , String animal){
    if(farmBuilder instanceof BeetFarmBuilder){
      return createBeetFarm(animal);
    } else if(farmBuilder instanceof WheatFarmBuilder){
      return createWheatFarm(owner , animal);
    }
    return null;
  }

  public SchruteFarm createBeetFarm(String animal){
    return farmBuilder.setCrop("Beet")
        .setAnimal(animal)
        .setOwner("Dwight Schrute")
        .setTemperature().build();
  }

  public SchruteFarm createWheatFarm(String owner, String animal){
    return farmBuilder.setCrop("Wheat")
        .setOwner(owner)
        .setAnimal(animal)
        .setTemperature().build();
  }
}
