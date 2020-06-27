package OOP_Excercises;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Person {

    private String name;
    private String surname;
    private int age;
    private Address address;

    public Person() {

    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

//    public Person(String name, String surname, int age, Address addAddress) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//        this.address = addAddress;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//    public void setAddress(Address address) {
//        this.address = address;
//    }

//    public String getName() {
//        return name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public int getAge() {
//        return age;
//    }

//    public Address getAddress() {
//        return address;
//    }

    public void introduce() {
        System.out.println("Name: " + name);
        System.out.print("Surname: " + surname);
    }
}
