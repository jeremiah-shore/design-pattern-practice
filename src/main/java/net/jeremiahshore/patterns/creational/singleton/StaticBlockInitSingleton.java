package net.jeremiahshore.patterns.creational.singleton;

public class StaticBlockInitSingleton {

    private static StaticBlockInitSingleton instance;

    //this allows for exception handling with eager initialization
    static {
        try {
            instance = new StaticBlockInitSingleton();
        } catch (Exception e) {
            throw new RuntimeException("exception thrown creating singleton instance");
        }
    }

    private StaticBlockInitSingleton() {
        //do something
    }

    public static StaticBlockInitSingleton getInstance() {
        return instance;
    }
}
