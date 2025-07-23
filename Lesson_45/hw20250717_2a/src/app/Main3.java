package app;

import app.model.Address;
import app.model.Person;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Jack", "Black", "jack.black@gmail.com", "+49 123456",
                        new Address("10115", "Berlin", "Main Str.", "5")),
                new Person("Anna", "White", "anna.white@gmail.com", "+49 654321",
                        new Address("20095", "Hamburg", "Elm Str.", "12")),
                new Person("John", "Doe", "john.doe@gmail.com", "+49 112233",
                        new Address("80331", "Munich", "Parkstr.", "8A")),
                new Person("Maria", "Green", "maria.green@gmail.com", "+49 445566",
                        new Address("50667", "Cologne", "Marketplatz", "1")),
                new Person("Peter", "Brown", "peter.brown@gmail.com", "+49 778899",
                        new Address("04109", "Leipzig", "Hauptstr.", "33")),
                new Person("Olga", "Smith", "olga.smith@gmail.com", "+49 998877",
                        new Address("70173", "Stuttgart", "Ringstr.", "10"))
        );

        List<String> list1 = list.stream()
                .map(p -> p.getEmail())
                .toList();

        System.out.println(list1);

        List<Address> list2 = list.stream()
                .map(p -> p.getAddress())
                .toList();
        System.out.println(list2);

        // map:    Function<T,R>       R apply (T element)
        //                             преобразование из T в R

        //filter: Predicate<T>         boolean test(T element)
        //                             отбор элементов по условию

        List<Address> list3 = list.stream() // получили поток из Person из листа
                .filter(p -> p.getfName().startsWith("J")) // убрали всех Person для которых не выполняется условие
                .map(p -> p.getAddress())                   // преобразовали Person -> адрес, далее идет поток адресов
                .filter(a -> a.getCity().equals("Berlin"))// из потока адресов убрали адреса которые не равны Berlin
                .toList();                                  // все собрали в лист адресов
        System.out.println(list3);


        List<Person> list4 = list.stream()
                .filter(p -> p.getfName().startsWith("J"))
                .filter(p -> p.getAddress().getCity().equals("Berlin"))
                .sorted((p1,p2)-> p1.getlName().compareTo(p2.getlName()))
                .toList();
    }
}
