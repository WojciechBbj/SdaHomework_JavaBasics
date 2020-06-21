package collectionExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5 {
    public static List<String> listOfNames = new ArrayList<String>();

    public static void addNames(int howMuch) {
        System.out.println("5a, adding 5 names");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < listOfNames.size(); i++) {
            System.out.print("Podaj imie: ");
            listOfNames.add(scanner.next());
        }
    }
}
