package prototype;

public class Client {

  public static void main(String[] args) {
    Student student = new Student(30 , 1 , "Dwight");
    Student studentClone = (Student) student.clone();
//    studentClone.name = "Jim";
    studentClone.age = 29;

    System.out.println(student);
    System.out.println(studentClone);

    // Just for fun
    if(studentClone.name == student.name){
      System.out.println("Identity theft is not a joke, Jim! Millions of families suffer every year!");
    }
  }
}
