package prototype;

import java.util.Objects;

public class Client {

  public static void main(String[] args) {
    Dwight dwight = new Dwight(30 , 1 , "Dwight");
    Dwight jim = (Dwight) dwight.clone();
//    studentClone.name = "Jim";
    jim.age = 29;

    System.out.println(dwight);
    System.out.println(jim);

    // Just for fun
    if(Objects.equals(jim.name, dwight.name)){
      System.out.println("Identity theft is not a joke, Jim! Millions of families suffer every year!");
    }
  }
}
