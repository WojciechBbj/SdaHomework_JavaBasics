package java_exercises_3_sda;

public class Ex12 {
    public double ex12 (Figure[] figures) {

        double totalFigureArea = 0;

        for (Figure figure:figures) {
            totalFigureArea += figure.getArea();
        }

        return totalFigureArea;
    }
}
