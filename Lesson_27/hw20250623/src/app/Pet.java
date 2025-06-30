package app;

public class Pet {
    // тип (кот, собака, попугай и т.д.), имя, цвет, возраст

    String type;
    String name;
    String color;
    int age;

    public Pet(String type, String name, String color, int age){
        this.type = type;
        this.age = age;
        this.name = name;
        this.color = color;
    }

    // Бобик (собака) Возраст: 5 Цвет: черный
    public String toString(){
        return  name + " (" + type + ") Возраст: " + age + " Цвет: " + color;
    }
}
