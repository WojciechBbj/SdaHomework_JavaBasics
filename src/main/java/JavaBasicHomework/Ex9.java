package JavaBasicHomework;

import java.util.Scanner;

public class Ex9 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Podaj pierwsza liczbe: ");
            int number1 = scanner.nextInt();

            System.out.print("Podaj druga liczbe: ");
            int number2 = scanner.nextInt();


            double restOfDivide = number1 - (number1 / number2) * number2;

            System.out.println("Reszta z dzielenia obu liczb, to: " + restOfDivide);

            double difference2 = (double) number1 % number2;

            System.out.println("Reszta z dzielenia obu liczb, to: " + difference2);

            System.out.println(number1/number2);
        }
    }
}
