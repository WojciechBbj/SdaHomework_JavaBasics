package java_exercises_3_sda;

public class Dog implements Animal {

    public String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public String makeSound() {
         return dogName + " makes hau hau !!!";
    }
}
