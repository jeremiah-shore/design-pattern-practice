package net.jeremiahshore.patterns.creational.singleton;

//globally accessible, but does not support lazy initialization
public enum EnumSingleton {

    INSTANCE;

    public static void doSomething() {
        //do something
    }

}
