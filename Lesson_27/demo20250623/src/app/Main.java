package app;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jack", "Jackson", 20);
        System.out.println(p1);

        System.out.println(p1.getAge()); // получить возраст

        p1.setAge(-22);
        System.out.println(p1);
        System.out.println(p1.getName());

        Person[] people = {
                new Person("jack0", "jackson0", 24),
                new Person("jack1", "jackson1", 25),
                new Person("jack2", "jackson2", 26),
                new Person("jack3", "jackson3", 21),
                new Person("jack4", "jackson4", 23)
        };
        PersonArray personArray = new PersonArray(people);
        System.out.println(personArray);
        System.out.println("Самый старший:");
        System.out.println(personArray.getOldest());


    }

}
