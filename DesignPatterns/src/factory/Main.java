package factory;

public class Main {
  public static void main(String[] args) {
    PaperFactory paperFactory = new PaperFactory();
    Paper smoothPaper = paperFactory.getPaper("smooth");
    smoothPaper.sell();
    Paper printerPaper = paperFactory.getPaper("printer");
    printerPaper.sell();
    Paper glitterPaper = paperFactory.getPaper("glitter");
    glitterPaper.sell();
  }

}
