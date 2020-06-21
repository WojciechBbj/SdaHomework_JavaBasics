package JavaBasicHomework;

import java.util.Scanner;


public class Ex8 {

    public static void printSeriesTable(int[] table) {
        System.out.println("Wprowadzony ciąg ma postać: ");
        for (int i = 0; i < table.length; i++) {
            if (i < table.length - 1) {
                System.out.print(table[i] + ", ");
            } else {
                System.out.print(table[i] + ".");
            }
        }
        System.out.println();
    }

    public static boolean isArithmeticSeries(int[] table) {
        int diffCheck;
        boolean isTrue = false;
        for (int i = 0; i < table.length - 1; i++) {
            diffCheck = table[i + 1] - table[i];
            for (int j = 0; j <= i; j++) {
                if (diffCheck == table[j + 1] - table[j]) {
                    isTrue = true;
                } else {
                    isTrue = false;
                    break;
                }
            }
        }
        return isTrue;
    }

    public static void ArithmeticSeries(int[] table) {
        int diffCheck;
        boolean isTrue = true;
        for (int i = 0; i < table.length - 1; i++) {
            diffCheck = table[i + 1] - table[i];
            for (int j = i + 1; j <= i; j--) {
                System.out.println("i: " + i + ", j: " + j + ", diffCheck: " + diffCheck);
                if (diffCheck == table[j + 1] - table[j]) {
                    isTrue = true;

                } else {
                    isTrue = false;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj długość ciągu: ");
        int arithmeticSeriesLength = scanner.nextInt();

        int[] seriesTable = new int[arithmeticSeriesLength];

        for (int i = 0; i < arithmeticSeriesLength; i++) {
            System.out.print("Podaj " + (i + 1) + " element ciągu: ");
            seriesTable[i] = scanner.nextInt();
        }
        printSeriesTable(seriesTable);

        System.out.println("Wprowadzony ciag znaków jest ciągiem arytmetycznym: " + isArithmeticSeries(seriesTable));

        ArithmeticSeries(seriesTable);
    }
}
