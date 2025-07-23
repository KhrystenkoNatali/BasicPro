package app;

import java.util.ArrayList;
import java.util.List;

public class MainBuilder {
    public static void main(String[] args) {
        Person p1=new Person.Builder("Jack","Jackson")
                .height(170)
                .age(40)
                .build();

        System.out.println(p1);

        Person p2= new Person.Builder("John", "Johnson").weight(66)
                .age(25).build();
        System.out.println(p2);

        Person p3=new Person.Builder("Ivan","Ivanov")
                .age(33).weight(77).height(180).build();
        System.out.println(p3);

        Person p4=new Person.Builder("Vasya", "Vasin").build();
        // метод build превращает инстанс Builder в инстанс Person

        List<Person> company= new ArrayList<Person>();
        company.add(p1);
        company.add(p2);
        company.add(p3);
        company.add(p4);

        System.out.println(company);


    }
}

/*
HW_33_TEXT
1. Создайте класс Book (название, автор). Создайте ArrayList<Book>.
Добавьте туда несколько объектов.
Напишите метод `ArrayList<Book> getBook (ArrayList<Book> list, String author)`
который возвращает список книг, заданного автора.
Распечатайте его из мейна.
1.2 adv.
Предусмотрите в задаче 1. возможность поиска книг по списку авторов для
конкретной книги НАПРИМЕР
Илья Ильф, Евгений Петров
Борис Стругацкий, Аркадий Стругацкий
.
 */


