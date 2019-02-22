package net.jeremiahshore.patterns.creational.factory.simple;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("from inside the Square::draw() method");
    }
}
