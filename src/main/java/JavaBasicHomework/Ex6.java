package JavaBasicHomework;

import java.util.Scanner;

public class Ex6 {

    public static void printTable(int[] table) {
        for (int i = 0; i < table.length; i++) {
            if (i < table.length - 1) {
                System.out.print(table[i] + ", ");
            } else {
                System.out.print(table[i] + ".");
            }
        }
        System.out.println();
    }

    public static int sumOfNegativeNumbers(int[] table) {
        int sumOfNegativeNumbers = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] < 0) {
                sumOfNegativeNumbers += table[i];
            }
        }
        return sumOfNegativeNumbers;
    }

    public static int numberOfNegativeNumbers(int[] table) {
        int numberOfNegativeNumbers = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] < 0) {
                numberOfNegativeNumbers++;
            }
        }
        return numberOfNegativeNumbers;
    }

    public static void negativeTable(int[] table) {
        int[] negativeTable = new int[numberOfNegativeNumbers(table)];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < numberOfNegativeNumbers(table); j++) {
                if (table[i] < 0) {
                    negativeTable[j] = table[i];
                }
            }
        }
        System.out.println("Tablica ujemnych wartości ma postać: ");
        for (int i = 0; i < negativeTable.length; i++) {
            if (i < negativeTable.length -1) {
                System.out.print(table[i] + ", ");
            } else {
                System.out.print(table[i] + ".");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar tablic: ");
        int tableSize = scanner.nextInt();

        int[] table = new int[tableSize];

        //wprowadzenie danych do tablicy
        for (int i = 0; i < table.length; i++) {
            System.out.print("Podaj element " + i + " tablicy: ");
            table[i] = scanner.nextInt();
        }

        System.out.println("Tablica ma postać: ");
        printTable(table);

        System.out.println("Suma wartości ujemnych wprowadzonych do tablicy wynosi: " + sumOfNegativeNumbers(table));

        System.out.println("Suma ujemnych wartości: " + sumOfNegativeNumbers(table));

        negativeTable(table);
    }
}
