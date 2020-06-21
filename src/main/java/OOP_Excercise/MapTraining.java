package OOP_Excercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTraining {

    public static void exMat() {
        Map<Integer, String> mapOfNames = new HashMap<Integer, String>();
        mapOfNames.put(1,"Katarzyna");
        mapOfNames.put(2,"Maria");
        mapOfNames.put(3,"Paweł");
        System.out.println("current size: " + mapOfNames.size());
        mapOfNames.put(1, "Adam");
        System.out.println("updated size: " + mapOfNames.size());
    }
    public static void main(String[] args) {
        System.out.println("Map:");
        exMat();
    }
}
