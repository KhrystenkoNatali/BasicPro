package app;

public class Main {
    public static void main(String[] args) {
        Outer.Inner obj1=new Outer.Inner();
        obj1.run();

        System.out.println("=======================");
        Outer2 outer2=new Outer2(); // нужен инстанс внешнего класса
        Outer2.Inner obj2=outer2.new Inner();
        obj2.run();



    }

}
