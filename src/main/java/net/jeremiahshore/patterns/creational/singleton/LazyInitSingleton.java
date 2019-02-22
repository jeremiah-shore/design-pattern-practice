package net.jeremiahshore.patterns.creational.singleton;

public class LazyInitSingleton {

    private static LazyInitSingleton instance;

    private LazyInitSingleton() {
        //do something
    }

    public static LazyInitSingleton getInstance() {
        if(instance == null) {
            instance = new LazyInitSingleton();
        }
        return instance;
    }
}
