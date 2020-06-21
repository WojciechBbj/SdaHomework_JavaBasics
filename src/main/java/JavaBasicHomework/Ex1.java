package JavaBasicHomework;

import java.util.Scanner;

public class Ex1 {
    public static void printMultiplying(int x, int y) { // metoda wyświetli skrocona tabliczę mnożenia w postaci x x y = result; x = 5, y (1 - 4)

        for (int i = 1; i <= y; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }
    }

    public static void main (String[] args) {

        //printMultiplying(5, 4);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę, dla której chcesz wyświetlić tabliczkę mnożenia: ");
        int multiplyNumber = scanner.nextInt();

        System.out.print("Podaj, której liczby ma zostać wyświetlona tabliczka mnożenia: ");
        int multiplyNumberBy = scanner.nextInt();

        printMultiplying(multiplyNumber, multiplyNumberBy);


    }
}
