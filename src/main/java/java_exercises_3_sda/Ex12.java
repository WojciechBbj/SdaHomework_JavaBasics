package java_exercises_3_sda;

import java.util.Scanner;

public class Ex12 {
    public static void ex12 () {
        Figure figure1 = new Rectangle(5,6);
        Figure figure2 = new Circle(5);
        Figure figure3 = new Triangle(4, 5);

        double totalFigureArea = figure1.getArea() + figure2.getArea() + figure3.getArea();

        System.out.println("Suma powierzchni wprowadzonych fitur wynosi: " + totalFigureArea);

        System.out.println("Rozwiazanie zadania 13");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj powierzchnię, która ma być pokrya farbą: ");
        double paintArea = scanner.nextDouble();

        if (paintArea > totalFigureArea) {
            System.out.println("Farby nie wystarczy na pomalowanie pola wrowadzonych figur");
        } else {
            System.out.println("Farba pokryje pole wprowadzonych figur");
        }
    }
}
