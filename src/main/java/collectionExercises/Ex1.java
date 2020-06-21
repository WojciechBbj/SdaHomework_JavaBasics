package collectionExercises;

public class Ex1 {
    public static void printTable(int[] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.print("[" + table[i] + "] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int table[] = new int[10];

        int tableLength = table.length;

        System.out.println("Tablica ma długość: " + tableLength);

        System.out.println("Tablica ma postac:");

        for (int i = 0; i < tableLength; i++) {
            table[i] = i;
        }
        printTable(table);

        System.out.println("Elementy tablicy pomnożono przez 2");

        for (int i = 0; i < tableLength; i++) {
            table[i] = table[i] * 2;
        }

        System.out.println("Nowa tablica ma postać:");

        printTable(table);





    }
}
