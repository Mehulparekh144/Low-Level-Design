package singleton;

import singleton.doublelocking.DoubleLockReception;
import singleton.eager.Reception;
import singleton.lazy.LazyReception;
import singleton.sync.SynchronizedReception;

public class Michael {

  public static void main(String[] args) {
    // Eager
    Reception pam = Reception.getPam();

    //Lazy
    LazyReception pamLazy = LazyReception.getPam();

    //Synchronized
    SynchronizedReception pamSync = SynchronizedReception.getPam();

    //Double Locking
    DoubleLockReception pamDoubleLock = DoubleLockReception.getPam();


  }
}
