package JavaBasicHomework;

import java.util.Scanner;

public class Ex7 {

    public static int arithmeticSeries(int arithmeticSeriesLength, int seriesFirstElement, int arithmeticDifference) {

        return seriesFirstElement + (arithmeticSeriesLength - 1) * arithmeticDifference;
    }

    public static void arithmeticSeriesElements(int arithmeticSeriesLength, int seriesFirstElement, int arithmeticDifference) {

        for (int i = 1; i <= arithmeticSeriesLength; i++) {
            if (i < arithmeticSeriesLength) {
                System.out.print(arithmeticSeries(i, seriesFirstElement, arithmeticDifference) + ", ");
            } else {
                System.out.print(arithmeticSeries(i, seriesFirstElement, arithmeticDifference) + ".");
            }

        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość ciągu: ");
        int arithmeticSeriesLength = scanner.nextInt();

        System.out.print("Podaj pierwszy element ciągu: ");
        int seriesFirstElement = scanner.nextInt();

        System.out.print("Podaj różnicę ciągu: ");
        int arithmeticDifference = scanner.nextInt();

        arithmeticSeriesElements(arithmeticSeriesLength, seriesFirstElement, arithmeticDifference);
    }
}