package net.jeremiahshore.patterns.creational.singleton;

public class EagerInitSingleton {

    private static final EagerInitSingleton INSTANCE = new EagerInitSingleton();

    private EagerInitSingleton() {
        //do something
    }

    public static EagerInitSingleton getInstance() {
        return INSTANCE;
    }
}
