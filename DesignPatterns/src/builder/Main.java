package builder;

public class Main {

  public static void main(String[] args) {
    Director director = new Director(new EngineerStudentBuilder());
    System.out.println(director.createEngineerStudent());
    director = new Director(new MBAStudentBuilder());
    System.out.println(director.createMBAStudent());

  }
}
