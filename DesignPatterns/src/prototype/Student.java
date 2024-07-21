package prototype;

public class Student implements Prototype {

  public int age;
  private int id;
  public String name;

  public Student(int age, int id, String name) {
    this.age = age;
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student{" +
        "age=" + age +
        ", id=" + id +
        ", name='" + name + '\'' +
        '}';
  }

  @Override
  public Prototype clone() {
    return new Student(age, id, name);
  }
}
