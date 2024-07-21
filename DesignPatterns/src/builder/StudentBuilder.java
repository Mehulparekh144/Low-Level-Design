package builder;

import java.util.List;

public abstract class StudentBuilder {
  public int roll;
  public String name;
  public String address;
  public int phone;
  public String email;
  public List<String> subjects;

  public StudentBuilder setRoll(int roll) {
    this.roll = roll;
    return this;
  }

  public StudentBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public StudentBuilder setAddress(String address) {
    this.address = address;
    return this;
  }

  public StudentBuilder setPhone(int phone) {
    this.phone = phone;
    return this;
  }

  public StudentBuilder setEmail(String email) {
    this.email = email;
    return this;
  }

  public abstract StudentBuilder setSubjects();


  public Student build() {
    return new Student(this);
  }

}
