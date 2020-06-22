package collectionExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5 {
    public static List<String> listOfNames = new ArrayList<String>();

    public static void addNames(int howMuch) {
        System.out.println("5a, adding " + howMuch + " names");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < howMuch; i++) {
            System.out.print("Podaj imie: ");
            listOfNames.add(scanner.next());
        }
    }

    public static void showList() {
        int i = 0;
        System.out.println("5a, List od names:");
        while (i < listOfNames.size()) {
            System.out.println(listOfNames.get(i));
            i++;
        }
    }

    public static void main(String[] args) {
        addNames(5);
        showList();
    }
}
