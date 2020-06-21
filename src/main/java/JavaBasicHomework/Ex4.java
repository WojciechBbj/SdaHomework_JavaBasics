package JavaBasicHomework;

public class Ex4 {

    public static void changedTable(int[] table) {
        int tableSize = table.length;
        int lastIndex = table.length - 1;
        int temp = table[0]; //12
        //int[] changedTable = new int[tableSize];
        System.out.println("Odwrócona tablica ma postać: ");

        if (table.length >= 2) {
            table[0] = table[lastIndex];
            table[lastIndex] = temp;

        } else {
            System.out.println("Ta tablica jest za mała");
        }

        printTable(table);

    }

    public static void printTable(int[] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.print("[" + table[i] + "] ");
        }
    }

    public static void main(String[] args) {
        int[] table = {12, 7, 19};
        System.out.println("Tabela ma postać: ");
        printTable(table);
        System.out.println();
        changedTable(table);
    }
}
