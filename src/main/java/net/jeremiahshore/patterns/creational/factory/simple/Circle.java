package net.jeremiahshore.patterns.creational.factory.simple;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("from inside the Circe::draw() method");
    }
}
