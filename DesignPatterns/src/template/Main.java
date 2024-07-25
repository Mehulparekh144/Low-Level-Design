package template;

public class Main {
  public static void main(String[] args) {
    SaleFlow dunderMifflin = new DunderMifflin();
    dunderMifflin.process();

    SaleFlow saber = new Saber();
    saber.process();
  }
}
