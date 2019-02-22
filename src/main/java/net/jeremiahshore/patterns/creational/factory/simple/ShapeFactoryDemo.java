package net.jeremiahshore.patterns.creational.factory.simple;

public class ShapeFactoryDemo {

    public static void main(String[] args) {
        ShapeFactory factory = ShapeFactory.getInstance();

        Shape shape1 = factory.getShape("CIRCLE");
        Shape shape2 = factory.getShape("TRIANGLE");
        Shape shape3 = factory.getShape("SQUARE");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }

}
