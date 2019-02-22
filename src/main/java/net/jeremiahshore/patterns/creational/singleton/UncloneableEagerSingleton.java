package net.jeremiahshore.patterns.creational.singleton;

public class UncloneableEagerSingleton {

    private static UncloneableEagerSingleton INSTANCE = new UncloneableEagerSingleton();

    private UncloneableEagerSingleton() {

    }

    public static UncloneableEagerSingleton getInstance() {
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
