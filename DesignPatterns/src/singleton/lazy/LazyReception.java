package singleton.lazy;

public class LazyReception {

  private static LazyReception pam = null;

  private LazyReception(){

  }

  public static LazyReception getPam(){
    if(pam == null){
      pam = new LazyReception();
    }
    return pam;
  }
}
