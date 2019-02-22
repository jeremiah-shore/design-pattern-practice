package net.jeremiahshore.patterns.creational.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        //do something
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if(instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

}
