package factory;

public class PaperFactory {
  Paper getPaper(String input){
    return switch (input) {
      case "glitter" -> new GlitterPaper();
      case "smooth" -> new SmoothPaper();
      case "printer" -> new PrinterPaper();
      default -> null;
    };
  }
}
