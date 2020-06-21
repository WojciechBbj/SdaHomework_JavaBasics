package JavaBasicHomework;

import java.util.ArrayList;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        Cow cow = new Cow();

        Dog dog = new Dog();

        Cat cat = new Cat();

        List<Animal> listOfAnimal = new ArrayList<Animal>();
        listOfAnimal.add(cow);
        listOfAnimal.add(dog);
        listOfAnimal.add(cat);

        for (Animal animal:listOfAnimal) {
            System.out.println(animal.makeSound());
        }

    }
}
