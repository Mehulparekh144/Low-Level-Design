package builder;

import java.util.ArrayList;
import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder{


  @Override
  public StudentBuilder setSubjects() {
    this.subjects = new ArrayList<>(List.of("PDP", "DSA", "DBMS", "OS", "Computer Science"));
    return this;
  }
}
