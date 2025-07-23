/*
Добавить в код написанный в классе метод indexOf(Person person),
который возвращает индекс заданного person в нашем списке.
 Если такого person нет - возвращаем null
 */
package app;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyArrayList(); // можно заменить на new MyLinkedList()

        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);
        Person p3 = new Person("Charlie", 22);

        list.add(p1);
        list.add(p2);

        System.out.println("Список:");
        System.out.println(list);

        System.out.println("Индекс Bob: " + list.indexOf(p2));       // должен вернуть 1
        System.out.println("Индекс Charlie: " + list.indexOf(p3));   // должен вернуть null
    }
}
