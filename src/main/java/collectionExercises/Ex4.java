package collectionExercises;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static List<String> listOfNames = new ArrayList<String>();

    public static void addNamesToList() {
        System.out.println("4a, Adding 5 names to the list");
        listOfNames.add("Katarzyna");
        listOfNames.add("Anna");
        listOfNames.add("Iwona");
        listOfNames.add("Paweł");
        listOfNames.add("Piotr");

    }

    public static void showListedNames() {
        System.out.println("2b, showing names");
        for (int i = 0; i < listOfNames.size(); i++) {
            System.out.println(listOfNames.get(i));
        }
    }

    public static void showListedNamesBackwards() {
        System.out.println("2c, showing names backwards");
        for (int i = 0; i < listOfNames.size(); i++) {
            System.out.println(listOfNames.get(listOfNames.size() - 1 - i));
        }
    }

    public static void main(String[] args) {
        addNamesToList();
        showListedNames();
        showListedNamesBackwards();
    }
}
