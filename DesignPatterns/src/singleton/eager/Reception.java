package singleton.eager;

public class Reception {

  private static final Reception pam = new Reception();

  private Reception() {
  }

  public static Reception getPam() {
    return pam;
  }

}
