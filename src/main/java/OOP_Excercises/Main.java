package OOP_Excercises;

public class Main {
    public static void main(String[] args) {


        Address address1 = new Address("Mickiewicza", "Poznań", "Polska","8", "5");
        Person person1 = new Person("Kowalski", "Jan", 31, address1);

        person1.introduce();

        person1.setAddress(new Address("Kamiennogórska", "Leszno", "Polska","7", "117"));
        person1.getAddress().showAdress();

        Person person2 = new Person("Marek", "Malinowski", 30);
        person2.setAddress(person1.getAddress());

        person2.introduce();
        person2.getAddress().showAdress();
    }
}
