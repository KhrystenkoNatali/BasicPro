package app;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Square(4));
        shapes.add(new Rectangle(3, 6));
        shapes.add(new Circle(2));

        double totalArea = ShapeUtils.calculateTotalArea(shapes);
        System.out.println("Total area: " + totalArea);

        Shape largest = ShapeUtils.findShapeWithLargestArea(shapes);
        System.out.println("Largest area: " + largest.calcArea());

        List<Shape> filtered = ShapeUtils.filterShapesByArea(shapes, 15);
        System.out.println("Shapes with area > 15: " + filtered.size());
    }
}
