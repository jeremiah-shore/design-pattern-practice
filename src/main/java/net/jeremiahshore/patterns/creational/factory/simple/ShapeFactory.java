package net.jeremiahshore.patterns.creational.factory.simple;

public class ShapeFactory {

    //eager initialization singleton
    private static final ShapeFactory INSTANCE = new ShapeFactory();

    public static ShapeFactory getInstance() {
        return INSTANCE;
    }

    public Shape getShape(String type) {
        if(type == null) {
            return null;
        }

        if(type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if(type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if(type.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }

        return null;
    }

}
