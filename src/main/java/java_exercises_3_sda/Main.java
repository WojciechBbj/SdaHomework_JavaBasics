package java_exercises_3_sda;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Mruczek");
        Cat cat2 = new Cat("Filemon");
        Cat cat3 = new Cat("Bonifacy");

        Cat[] catTable = {cat1, cat2, cat3};

        for (int i = 0; i < catTable.length; i++) {
            catTable[i].makeSound();
        }

        cat1.eatMouse();
        cat2.eatMouse();
        cat3.eatMouse();
    }
}
