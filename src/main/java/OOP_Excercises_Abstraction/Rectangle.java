package OOP_Excercises_Abstraction;

public class Rectangle extends Figure {
    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public float countArea() {
        return sideA * sideB;
    }

    @Override
    public void displayArea() {
        System.out.println("Figura: Prostokąt, pole: " + countArea());
    }
}
