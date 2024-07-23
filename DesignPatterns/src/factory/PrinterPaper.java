package factory;

public class PrinterPaper implements Paper{
  @Override
  public void sell() {
    System.out.println("Selling printer paper");
  }
}
