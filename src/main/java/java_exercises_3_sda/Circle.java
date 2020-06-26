package java_exercises_3_sda;

public class Circle implements Figure {

    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
