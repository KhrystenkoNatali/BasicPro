package app;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5, 6));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(6, 7));
        shapes.add(new Square(6));
        shapes.add(new Circle(2));
        print(shapes);
        System.out.println("---------------------");
        System.out.println("Площадь всех фигур: " + totalArea(shapes));
        System.out.println("Самая большая фигура: " + largestShape(shapes));
        System.out.println("Фигуры с площадью больше чем 30:");
        print(getShapesLargeThan(shapes, 30));
    }

    public static void print(List<Shape> list) {
        if (list != null) {
            for (Shape shape : list) {
                System.out.println(shape);
            }
        }
    }

    public static double totalArea(List<Shape> list) {
        double sum = 0;
        for (Shape shape : list) {
            sum += shape.calcArea();
        }
        return sum;
    }

    public static Shape largestShape(List<Shape> list) {

        if (list == null || list.isEmpty()) {
            return null;
        }
        Shape max = list.get(0);
        for (Shape shape : list) {
            if (shape.calcArea() > max.calcArea()) {
                max = shape;
            }
        }
        return max;
    }

    public static List<Shape> getShapesLargeThan(List<Shape> list, double areaLimit) {
        List<Shape> result = new ArrayList<>();
        for (Shape shape : list) {
            if (shape.calcArea() > areaLimit) {
                result.add(shape);
            }
        }
        return result;
    }
}
