package java_exercises_3_sda;

public class Rectangle implements Figure {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {

        return width * height;
    }
}
