package OOP_Excercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExercise {

    public static class ListTraining {

        public static void exList() {
            List<String> listOfNames = new ArrayList<String>();
            listOfNames.add("Katarzyna");
            listOfNames.add("Maria");
            listOfNames.add("Paweł");
            System.out.println("current size: " + listOfNames.size());
            listOfNames.add("Katarzyna");
            System.out.println("updated size: " + listOfNames.size());
        }

        public static void exSet() {
            Set<String> setOfNames = new HashSet<String>();
            setOfNames.add("Katarzyna");
            setOfNames.add("Maria");
            setOfNames.add("Paweł");
            System.out.println("current size: " + setOfNames.size());
            setOfNames.add("Katarzyna");
            System.out.println("current size: " + setOfNames.size());
        }


        public static void main(String[] args) {
            System.out.println("List:");
            exList();
            System.out.println("Set:");
            exSet();
        }
    }
}
