package observer;

import observer.Observable.Dwight;
import observer.Observable.Employee;
import observer.Observable.Jim;
import observer.Observable.Pam;
import observer.Observer.Boss;
import observer.Observer.Michael;

public class Client {
  public static void main(String[] args) {
    Boss michael = new Michael();
    Employee dwight = new Dwight(michael);
    Employee jim = new Jim(michael);
    Employee pam = new Pam(michael);
    michael.setPolicy("Fire everyone");
    michael.setPolicy("Hire everyone");
  }
}
