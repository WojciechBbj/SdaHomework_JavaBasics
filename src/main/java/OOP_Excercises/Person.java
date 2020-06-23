package OOP_Excercises;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person() {

    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Name: " + name);
        System.out.print("Surname: " + surname);
    }
}
