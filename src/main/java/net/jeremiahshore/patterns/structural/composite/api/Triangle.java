package net.jeremiahshore.patterns.structural.composite.api;

public class Triangle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.printf("Drawing a %s Triangle%n", fillColor);
    }
}
