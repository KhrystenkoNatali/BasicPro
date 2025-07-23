package app;

public class Duck extends Bird implements Swimmable, Flyable {
    private String name;
    private String color;

    public Duck(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void swim(){
        System.out.println(name + ": крякнула и поплыла");
    }

    @Override
    public String getType() {
        return "утка";
    }

    @Override
    public void fly() {
        System.out.println("машем крыльями и летим!");
    }
}
