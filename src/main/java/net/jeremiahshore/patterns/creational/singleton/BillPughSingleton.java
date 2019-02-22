package net.jeremiahshore.patterns.creational.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {
        //do something
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
