package net.jeremiahshore.patterns.creational.singleton;

public class UncloneableSingleton {

    private static UncloneableSingleton INSTANCE = new UncloneableSingleton();

    private UncloneableSingleton() {

    }

    public static UncloneableSingleton getInstance() {
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
