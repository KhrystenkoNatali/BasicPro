package app;

public class Person {
    String firstName;
    String lastName;
    MyDate birthDate;

    public Person(String firstName, String lastName, MyDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String toString() {
        return firstName + " " + lastName + " (" + birthDate + ")";
    }
}

