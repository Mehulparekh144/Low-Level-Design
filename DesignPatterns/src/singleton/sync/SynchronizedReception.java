package singleton.sync;

public class SynchronizedReception {

    private static SynchronizedReception pam = null;

    private SynchronizedReception() {
    }

    public static synchronized SynchronizedReception getPam() {
      if (pam == null) {
        pam = new SynchronizedReception();
      }
      return pam;
    }
}
