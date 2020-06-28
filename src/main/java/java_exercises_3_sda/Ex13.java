package java_exercises_3_sda;

import java.util.Scanner;

public class Ex13 {

    public boolean isAreaCovered(Figure[] figures, double paintArea) {

        Ex12 ex12 = new Ex12();

        boolean isAreaCovered;

        if (paintArea < ex12.ex12(figures)) {
            isAreaCovered = false;
        } else {
            isAreaCovered = true;
        }
        return isAreaCovered;
    }
}