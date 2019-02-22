package net.jeremiahshore.patterns.creational.singleton;

import java.io.Serializable;

public class SerialSafeSingleton implements Serializable {

    //alternate way of providing the instance, instead of getInstance() convention
    public static SerialSafeSingleton instance = new SerialSafeSingleton();

    private SerialSafeSingleton() {

    }

    //read about specialize methods available to Serializable: https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html
    protected Object readResolve() {
        return instance;
    }

}
