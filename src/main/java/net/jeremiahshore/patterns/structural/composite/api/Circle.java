package net.jeremiahshore.patterns.structural.composite.api;

public class Circle implements Shape{

    @Override
    public void draw(String fillColor) {
        System.out.printf("Drawing a %s Circle%n", fillColor);
    }

}
