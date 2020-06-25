package java_exercises_3_sda;

import java.util.Scanner;

public class Cat implements Animal, Movable {

    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    @Override
    public String makeSound() {
        return catName + " makes miau miau !!!";
    }

    @Override
    public String move() {
        return "idę";
    }

    public void eatMouse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile myszy zjadł " + catName + " ?");
        int howManyMouse = scanner.nextInt();

        System.out.println(catName + ": Zjadłem " + howManyMouse + " myszy\n");
    }
    
}
