package singleton.lazy;

public class LazySingleton {
    private static volatile LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            // 1. what if 2 threads are here at the same time, one will get the lock
            // and another thread will wait , then the first thread will create the instance
            // now since there is no instance == null check, thread 2 will also create the
            // instance
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

// why using volatile
// "volatile prevents instruction reordering - ensuring the object is fully
// constructed before the reference becomes visible to other threads."