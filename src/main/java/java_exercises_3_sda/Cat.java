package java_exercises_3_sda;

import java.util.Scanner;

public class Cat implements Animal, Movable {

    private String name;

    public Cat(String name) {

        this.name = name;
    }

    @Override
    public String makeSound() {

        return name + " makes miau miau !!!";
    }

    @Override
    public String move() {
        return "idę";
    }

    public void eatMouse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile myszy zjadł " + name + " ?");
        int howManyMouse = scanner.nextInt();

        System.out.println(name + ": Zjadłem " + howManyMouse + " myszy\n");
    }

    @Override
    public String getName() {
        return name;
    }
    
}
