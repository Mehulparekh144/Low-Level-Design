package singleton.doublelocking;

public class DoubleLockReception {
  private static DoubleLockReception pam = null;

  private DoubleLockReception() {
  }

  public static DoubleLockReception getPam(){
    if(pam == null){
      synchronized (DoubleLockReception.class) {
        if(pam == null){
          pam = new DoubleLockReception();
        }
      }
    }
    return pam;
  }
}
