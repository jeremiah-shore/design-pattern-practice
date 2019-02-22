package net.jeremiahshore.patterns.creational.factory.improved.api.model;

public abstract class Bicycle {
    public enum Tires {
        ROAD, OFFROAD;
    }

    private int speed;
    private Tires tires;

    public void ride() {
        System.out.printf("I want to ride my %s!%n", this.getClass().getSimpleName());
    }

    Bicycle() {}
}
