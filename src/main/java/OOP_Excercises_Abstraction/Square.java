package OOP_Excercises_Abstraction;

public class Square extends Figure {

    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public float countArea() {
        return side * side;
    }

    @Override
    public void displayArea() {
        System.out.println("Figura: Kwadrat, pole: " + countArea());
    }
}
