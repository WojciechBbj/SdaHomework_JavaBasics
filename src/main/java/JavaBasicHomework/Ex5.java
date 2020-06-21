package JavaBasicHomework;

import java.util.Scanner;

public class Ex5 {


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

    public static int maxNumber(int[] table) {
        int maxNumber = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] >= maxNumber) {
                maxNumber = table[i];
            }
        }
        return maxNumber;
    }

    public static int minNumber(int[] table) {
        int minNumber = maxNumber(table);
        for (int i = 0; i < table.length; i++) {
            if (table[i] <= minNumber) {
                minNumber = table[i];
            }
        }
        return minNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar tablicy: ");
        int tableSize = scanner.nextInt();

        int[] table = new int[tableSize];

        //uzupełnienie tablicy
        for (int i = 0; i < tableSize; i++) {
            System.out.print("Podaj element " + i + " tablicy: ");
            table[i] = scanner.nextInt();
        }
        System.out.println("Wprowadzona tablica ma postać:");
        printTable(table);

        System.out.println("Maksymalna liczba w tablicy to: " + maxNumber(table));

        System.out.println("Minimalna liczba w tablicy to: " + minNumber(table));
    }
}
