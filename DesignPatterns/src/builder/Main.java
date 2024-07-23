package builder;

public class Main {

  public static void main(String[] args) {
    Dwight dwight = new Dwight(new BeetFarmBuilder());
    SchruteFarm beetFarm = dwight.createFarm("Jim Halpert", "Black Bear");
    System.out.println(beetFarm);

    Dwight dwight2 = new Dwight(new WheatFarmBuilder());
    SchruteFarm wheatFarm = dwight2.createFarm("Pam Beasly", "Cow");
    System.out.println(wheatFarm);
  }
}
