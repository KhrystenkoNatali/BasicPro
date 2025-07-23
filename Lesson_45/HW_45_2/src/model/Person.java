package model;

import java.util.Objects;

public class Person {
    private String fName;
    private String lName;
    private int age;
    private String email;

    public Person(String fName, String lName, int age, String email) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.email = email;
    }

    public String getfName() { return fName; }
    public String getlName() { return lName; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                fName.equals(person.fName) &&
                lName.equals(person.lName) &&
                email.equals(person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, age, email);
    }

    @Override
    public String toString() {
        return fName + " " + lName + ", " + age + " y.o., " + email;
    }

}
