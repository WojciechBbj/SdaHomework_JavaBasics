package softwareTest;

public class PersonDetails {
    String name;
    String surname;
    int age;

    PersonDetails(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean isChild() {
        return age >=0 && age < 10;
    }

}
