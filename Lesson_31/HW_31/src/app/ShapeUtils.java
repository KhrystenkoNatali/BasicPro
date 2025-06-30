package app;

import java.util.List;
import java.util.ArrayList;

public class ShapeUtils {
    public static double calculateTotalArea(List<Shape> shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.calcArea();
        }
        return total;
    }

    public static Shape findShapeWithLargestArea(List<Shape> shapes) {
        if (shapes.isEmpty()) return null;

        Shape largest = shapes.get(0);
        for (Shape shape : shapes) {
            if (shape.calcArea() > largest.calcArea()) {
                largest = shape;
            }
        }
        return largest;
    }

    public static List<Shape> filterShapesByArea(List<Shape> shapes, double minArea) {
        List<Shape> result = new ArrayList<>();
        for (Shape shape : shapes) {
            if (shape.calcArea() > minArea) {
                result.add(shape);
            }
        }
        return result;
    }
}
