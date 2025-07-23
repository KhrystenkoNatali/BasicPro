package app;

public class Person implements Swimmable, Swimmable2, Flyable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void swim(){
        System.out.println(name + ": кролем! брасом! поплыл");
    }

    @Override
    public String getType() {
        return "человек";
    }

    @Override
    public void fly() {
        System.out.println("нет крыльев изобрели самолет");
        System.out.println("полетели");
    }
}
