package builder;

public class Director {

  private final StudentBuilder studentBuilder;

  public Director(StudentBuilder studentBuilder) {
    this.studentBuilder = studentBuilder;
  }

  public Student createStudent(){
    if(studentBuilder instanceof EngineerStudentBuilder){
      return createEngineerStudent();
    } else if(studentBuilder instanceof MBAStudentBuilder){
      return createMBAStudent();
    }
    return null;
  }

  public Student createEngineerStudent() {
    return studentBuilder.setRoll(1)
        .setName("John Doe")
        .setAddress("123, Baker Street")
        .setPhone(1234567890)
        .setSubjects()
        .setEmail("john@engineer.com").build();
  }

  public Student createMBAStudent(){
    return studentBuilder.setRoll(2)
        .setAddress("456, Baker Street")
        .setPhone(987654321)
        .setName("Jane Doe")
        .setSubjects()

        .setEmail("jane@mba.com").build();
  }
}
