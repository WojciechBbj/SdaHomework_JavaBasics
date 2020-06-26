package java_exercises_3_sda;

public class Triangle implements Figure {

    public double triangleBase;
    public double height;

    public Triangle(double triangleBase, double height) {
        this.triangleBase = triangleBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * triangleBase * height;
    }
}
