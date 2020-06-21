package JavaBasicHomework;

public class Ex4 {

    public static void changedTable(int[] table) {
        int tableSize = table.length;

        //int[] changedTable = new int[tableSize];

        for (int i = tableSize - 1; i >= 0; i--) {

            //changedTable[i] = table[tableSize - 1 - i];
            if (i > 0 ) {
                System.out.print(table[i] + ", ");
            } else {
                System.out.print(table[i] + ".");
            }

        }

    }

    public static void main(String[] args) {
        int[] table = {12, 7, 19};
        changedTable(table);
    }
}
