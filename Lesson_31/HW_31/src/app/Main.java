/*
Реализовать 3 класса геометрических фигур: круг (Circle), квадрат(Square) и прямоугольник (Rectangle).
Круг определяется радиусом, квадрат и прямоугольник своими сторонами.
 В каждом классе должен быть метод расчета площади фигуры calcArea().
В main создать List из нескольких разных фигур и посчитать суммарную площадь всех фигур в List
Написать метод, который находит фигуру с самой большой площадью
Написать метод, который формирует List из фигур, с площадью больше, чем заданное значение

 */
package app;

import java.util.List;
import java.util.ArrayList;

//Группа 68m

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
