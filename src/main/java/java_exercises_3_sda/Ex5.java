package java_exercises_3_sda;

public class Ex5 {

    public static void ex5() {

        Animal[] animalTable = new Animal[5];
        animalTable[0] = new Cat("Mruczek");
        animalTable[1] = new Cat("Filemon");
        animalTable[2] = new Cat("Bonifacy");
        animalTable[3] = new Dog("Reksio");
        animalTable[4] = new Dog("Scooby");

        for (Animal animal : animalTable) {
            System.out.println(animal.makeSound());
        }
    }
}
