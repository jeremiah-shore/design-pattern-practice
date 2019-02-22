package net.jeremiahshore.patterns.creational.factory.simple;

public class Triangle implements Shape{

    @Override
    public void draw() {
        System.out.println("from inside the Triangle::draw() method");
    }
}
