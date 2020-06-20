package JavaBasicHomework;

public class Ex1 {
    public static void calculator() { // metoda wyświetli skrocona tabliczę mnożenia w postaci x x y = result; x = 5, y (1 - 4)
        int x = 5;
        for (int y = 1; y <= 4; y++) {
            System.out.println("5 x " + y + " = " + (x * y));
        }
    }

    public static void main (String[] args) {

        calculator();
    }
}
