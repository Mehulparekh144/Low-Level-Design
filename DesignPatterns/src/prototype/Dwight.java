package prototype;

public class Dwight implements Prototype {

  public int age;
  private int id;
  public String name;

  public Dwight(int age, int id, String name) {
    this.age = age;
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Dwight{" +
        "age=" + age +
        ", id=" + id +
        ", name='" + name + '\'' +
        '}';
  }

  @Override
  public Prototype clone() {
    return new Dwight(age, id, name);
  }
}
