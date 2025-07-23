package app;

public class Person implements MyConstants{
    private String name;
    public static final String TYPE = "человек разумный";

    public Person(String name) {
        this.name = name;
        System.out.println(Person.WELCOME_MSG);
    }
}
