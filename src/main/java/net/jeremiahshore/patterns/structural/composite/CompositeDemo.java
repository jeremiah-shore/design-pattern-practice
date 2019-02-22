package net.jeremiahshore.patterns.structural.composite;

import net.jeremiahshore.patterns.structural.composite.api.Circle;
import net.jeremiahshore.patterns.structural.composite.api.Drawing;
import net.jeremiahshore.patterns.structural.composite.api.Shape;
import net.jeremiahshore.patterns.structural.composite.api.Triangle;

public class CompositeDemo {

    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        Shape shape1 = new Triangle();
        Shape shape2 = new Circle();

        drawing.add(shape1);
        drawing.add(shape2);

        drawing.draw("red");

        drawing.clear();
    }
}
