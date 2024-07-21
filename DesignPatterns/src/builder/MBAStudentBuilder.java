package builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{

  @Override
  public StudentBuilder setSubjects() {
    this.subjects = new ArrayList<>(List.of("Marketing", "Finance", "Human Resource", "Operations", "Information Technology"));
    return this;
  }
}
