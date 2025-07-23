package app;

public class Person {
    private int id;
    private String name;
    private int age;
    private static int counter = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int howManyPerson(){
        return counter;
    }

    @Override
    public String toString() {
        return "Person{" + id  +
                " name='" + name + '\'' +
                ", age=" + age +
                '}' + " Всего Person: " + counter;
    }
}
