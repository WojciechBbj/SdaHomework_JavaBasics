package java_exercises_3_sda;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Mruczek");
        Cat cat2 = new Cat("Filemon");
        Cat cat3 = new Cat("Bonifacy");
//
//        Cat[] catTable = {cat1, cat2, cat3};
//
        Dog dog1 = new Dog("Reksion");
//        Dog dog2 = new Dog("Scooby");
//
//        cat1.eatMouse();
//        cat2.eatMouse();
//        cat3.eatMouse();

        Ex5 ex5 = new Ex5();
        ex5.ex5();

        Vet movableCat1 = new Vet();
        movableCat1.sayHello(cat1);
        
        Vet movableDog1 = new Vet();
        movableDog1.sayHello(dog1);

        Animal animal1 = new Cat("Garield");

        Vet moveAnimal1 = new Vet();
        moveAnimal1.sayHello(animal1);



    }
}
