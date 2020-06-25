package java_exercises_3_sda;

import java.util.Scanner;

public class Cat {

    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    public void makeSound() {
        System.out.println(catName + " makes miau miau !!!");
    }

    public void eatMouse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile myszy zjadł " + catName + " ?");
        int howManyMouse = scanner.nextInt();

        System.out.println(catName + ": Zjadłem " + howManyMouse + " myszy\n");
    }
    
}
