package OOP_Excercises_Abstraction;

public class Circle extends Figure {

    int radius;

    public Circle(int side) {
        this.radius = radius;
    }

    @Override
    public float countArea() {
        return (float)Math.PI * radius * radius;
    }

    @Override
    public void displayArea() {
        System.out.println("Figura: Koło, pole: " + countArea());
    }
}
