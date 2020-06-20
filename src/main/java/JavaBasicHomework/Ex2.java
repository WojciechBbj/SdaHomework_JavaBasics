package JavaBasicHomework;

import java.util.Scanner;

public class Ex2 {

    public static boolean isPrimeNumber(int number) {
        int sumOfDivide = 0;
        for (int i = 1; i <= number; i++) {
            if (number%i == 0) {
                sumOfDivide++;
            }
        }

        if (sumOfDivide == 2) {
            return true;
        } else {
            return false;
        }

    }
    public static void main (String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj dowonlną dodatnią liczbę: ");

            int userNumber = scanner.nextInt();

            //System.out.println("Uzytkownik wprowadzil liczbe: " + userNumber);

            System.out.println("Liczba " + userNumber + " jest liczbą pierwszą: " + isPrimeNumber(userNumber));
        }
    }
}
