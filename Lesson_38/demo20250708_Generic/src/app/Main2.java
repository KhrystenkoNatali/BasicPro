package app;

public class Main2 {
    public static void main(String[] args) {
        MyList list = new MyArrayList();
        list.add(new Person("Jack",23));
        list.add(new Person("Ann",22));
        list.add(new Person("Mike",28));
        list.add(new Person("Nick",21));

        System.out.println(list);
        System.out.println("Размер листа: " + list.size());
        System.out.println("Элемент с индексом 0: " + list.get(0));
        System.out.println("Последний элемент: " + list.get(list.size()-1));

        System.out.println();
        Person findPerson = new Person("Ann",22);
        System.out.println("Найдем персона: " + findPerson);
        System.out.println("Индекс " + list.indexOf(findPerson));

        System.out.println("------------------------");
        list.add(new Person("John",51),0);
        System.out.println(list);

        System.out.println("==========================");
        MyList<String> list2 = new MyLinkedList<>();
        list2.add("qwe1");
        list2.add("qwe2");
        list2.add("qwe3");
        System.out.println(list2);

        MyList<Integer> list3 = new MyLinkedList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        System.out.println(list3);
        System.out.println(list3.indexOf(2));




    }
}
