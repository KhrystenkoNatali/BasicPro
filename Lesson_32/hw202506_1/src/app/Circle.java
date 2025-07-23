package app;

public class Circle  extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle (" +
                "radius=" + radius +
                ") area: " + calcArea();
    }

    public double calcArea(){
        // P*r^2
        return Math.PI * radius * radius;
    }
}
