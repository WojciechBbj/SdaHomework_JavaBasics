package java_exercises_3_sda;

public class Vet {


    public void sayHello(Cat cat) {
        System.out.println("Witaj " + cat.getName());
    }

    public void sayHello(Dog dog) {
        System.out.println("Witaj " + dog.getName());
    }

    public void sayHello(Animal animal) {
        System.out.println("Witaj " + animal.getName());
    }
}
