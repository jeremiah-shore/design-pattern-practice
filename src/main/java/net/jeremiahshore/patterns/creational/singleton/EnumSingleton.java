package net.jeremiahshore.patterns.creational.singleton;

/*globally accessible, but does not support lazy initialization

also unable to be broken by reflection, as enums don't have a constructor
 */
public enum EnumSingleton {

    INSTANCE;

    public static void doSomething() {
        //do something
    }

}
