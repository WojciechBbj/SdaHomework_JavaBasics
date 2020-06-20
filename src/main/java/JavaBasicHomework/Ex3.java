package JavaBasicHomework;

import java.util.Scanner;

public class Ex3 {

    public static int sumOfNumber(int X, int Y) {
        int sumOfNumber = 0;

        while (X <= Y) {
            sumOfNumber += X;
            X++;
        }

        return sumOfNumber;
    }

    public static void main (String[] args) {
        System.out.println("Program zsumuje liczby z zakresu X-Y, liczb ktore wprowadzi uzytkownik");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwsza liczbe (X): ");
        int numberX = scanner.nextInt();

        System.out.print("Podaj druga liczbe (Y): ");
        int numberY = scanner.nextInt();

        System.out.println("Suma liczb X - Y, to: " + sumOfNumber(numberX, numberY));
    }
}
