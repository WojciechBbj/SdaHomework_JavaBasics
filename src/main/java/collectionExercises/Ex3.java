package collectionExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {

    public static List<Double> listOfNumbers = new ArrayList<Double>();

    public static void addNumbersToList(int howMany) {
        for (int i = 0; i < howMany; i++) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj " + i + " element tablicy: ");
            listOfNumbers.add(scanner.nextDouble());

        }
    }

    public static void sumOfFirstAndLastElement() {
        System.out.println("2a, Sum of first and last list element: " + (listOfNumbers.get(0) + listOfNumbers.get(listOfNumbers.size() - 1)));
    }

    public static void multiplicationFirstAndLast() {
        System.out.println("2b, Multiplication of first and last list element: " + (listOfNumbers.get(0) * listOfNumbers.get(listOfNumbers.size() - 1)));
    }

    public static void divisionSecondAndBeforeLast() {
        if (listOfNumbers.size() >= 2) {

            System.out.println("2c, Division of second and before last list element: " + (listOfNumbers.get(1) / listOfNumbers.get(listOfNumbers.size() - 2)));

        } else  {
            System.out.println("Lista jest za mała");
        }
    }

    public static void main(String[] args) {
        addNumbersToList(10);
        sumOfFirstAndLastElement();
        multiplicationFirstAndLast();
        divisionSecondAndBeforeLast();
    }
}
