package OOP_Excercises_Abstraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Figure> figures = new ArrayList<Figure>();

    public static void addRectangularToList(int howManyRectangular) {
        int random1;
        int random2;
        for (int i = 0; i < howManyRectangular; i++) {
            random1 = (int) (Math.random() * 10);
            random2 = (int) (Math.random() * 10);
            Rectangle rectangle = new Rectangle(random1, random2);
            figures.add(rectangle);
        }
    }

    public static void addSquareToList(int howManySquare) {
        int random;
        for (int i = 0; i < howManySquare; i++) {
            random = (int) (Math.random() * 10);
            Square square = new Square(random);
            figures.add(square);
        }
    }

    public static void addCircleToList(int howManyCircle) {
        int random;
        for (int i = 0; i < howManyCircle; i++) {
            random = (int) (Math.random() * 10);
            Circle circle = new Circle(random);
            figures.add(circle);
        }
    }

    public static void showList() {
        for (int i = 0; i < figures.size(); i++) {
            System.out.println(figures.get(i));
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile figur ma zostać wprowadzonych do listy?");
        System.out.print("Podaj liczbę prostokątów do wygenerowania: ");
        int numberRectangular = scanner.nextInt();

        System.out.print("Podaj liczbę kwadratów do wygenerowania: ");
        int numberSquare = scanner.nextInt();

        System.out.print("Podaj liczbę prostokątó do wygenerowania: ");
        int numberCircle = scanner.nextInt();

        addRectangularToList(numberRectangular);
        addSquareToList(numberSquare);
        addCircleToList(numberCircle);
        showList();
    }
}
