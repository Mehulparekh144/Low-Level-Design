package builder;

import java.util.List;

public class Student {
  private int roll;
  private String name;
  private String address;
  private int phone;
  private String email;
  private List<String> subjects;

  public Student(StudentBuilder builder){
    this.roll = builder.roll;
    this.name = builder.name;
    this.address = builder.address;
    this.phone = builder.phone;
    this.email = builder.email;
    this.subjects = builder.subjects;
  }

  @Override
  public String toString() {
    return "Student{" +
        "roll=" + roll +
        ", name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", phone=" + phone +
        ", email='" + email + '\'' +
        ", subjects=" + subjects +
        '}';
  }
}
