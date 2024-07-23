package nullobject;

public class BossFactory {

  public Boss getBoss(String name){
    if(name.equals("Michael")){
      return new Michael();
    }
    return new NullCharlesMiner();
  }
}
