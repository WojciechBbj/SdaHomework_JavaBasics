package presentationExcercise;

public class ForEach {

    public static void ex1(String[] tableOfNames) {
        for (String name:tableOfNames) {
            System.out.println("Helllo" + name);
        }
    }

    public static String ex2(String[] arrayOfProducts) {
        String list = "";

        for (String products:arrayOfProducts) {
            list += products + ", ";
        }
        return list;
    }

    public static void main(String[] args) {
        String[] names = {"Agata", "Julia", "Miłosz"};
        String[] products = {"szynka", "masł", "pomidor"};
        ex1(names);
        String text = ex2(products);
        System.out.println(text);
    }

}
