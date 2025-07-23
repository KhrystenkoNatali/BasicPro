package app;

public class Main {
    public static void main(String[] args) {
        Box1 b1 = new Box1("hello");
        Box1 b2 = new Box1(10);
        Box1 b3 = new Box1(new Person("jack", 10));

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        Object value = b2.getValue();
        if(value instanceof Integer){
            Integer newValue = (Integer) value;
        } else if (value instanceof Person){
            Person newValue = (Person) value;
        }

        System.out.println("---------------------");
        Box2<String> b21 = new Box2<>("hello");
        Box2<Integer> b22 = new Box2<>(10);
        Box2<Person> b23 = new Box2<>(new Person("Jack",19));

        System.out.println(b21);
        System.out.println(b22);
        System.out.println(b23);

        Integer value1 = b22.getValue();



    }
}
