package app;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int id;
    private static long populationOfWorld=8_000_000_000l;
    public static double pi=3.14159;

    public Person(String name, String surname, int age, int id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static long getPopulationOfWorld() {
        return populationOfWorld;
    }

    public static void setPopulationOfWorld(long populationOfWorld) {
        Person.populationOfWorld = populationOfWorld;
    }

    @Override
    public String toString() {
        return "name='" + name   +
                ", surname='" + surname  +
                ", age=" + age +
                ", id=" + id ;
    }

    public static void sayHello(){
        System.out.println("Hello world!!!!");
    }

    public void myNameIs(){
        System.out.println("My name is "+ this.name);
        System.out.println("I know what the population now is " + populationOfWorld);
    }

    public static void sayGreeting(Person p){
        System.out.println("Hello my dear friend "+ p.name);
        System.out.println(Math.random());
        System.out.println(System.currentTimeMillis());

    }

}
