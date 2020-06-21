package collectionExercises;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    public static List<Integer> listOfNumbers = new ArrayList<Integer>();

    public static void addNumberToList (int howMuchNumbers) {
        System.out.println("2a, Adding numbers to list");
        int random = (int)(Math.random()*10);
        for (int i = 0; i < howMuchNumbers; i++) {
            listOfNumbers.add(random);
        }
    }
    public static void showElementsOfList() {
        System.out.println("2b, first list element: " + listOfNumbers.get(0));
        System.out.println("2c, last list element: " + listOfNumbers.get(listOfNumbers.size() - 1));
    }

    public static void main(String[] args) {
        addNumberToList(3);
        showElementsOfList();
    }
}
