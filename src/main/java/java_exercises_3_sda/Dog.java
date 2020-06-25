package java_exercises_3_sda;

public class Dog implements Animal {

    public String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String makeSound() {
         return name + " makes hau hau !!!";
    }

    @Override
    public String getName() {
        return name;
    }
}
