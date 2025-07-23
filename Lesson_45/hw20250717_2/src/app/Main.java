package app;

import app.model.Address;
import app.model.Person;
import app.service.PersonsService;

import java.util.List;

public class Main {
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

        PersonsService.print(list);

        System.out.println("Список ФИО: ");
        List<String> fioList = PersonsService.getInfo(list, p -> p.getfName() + " " + p.getlName());
        PersonsService.print(fioList);

        System.out.println();
        System.out.println("Список email: ");
        List<String> emailList = PersonsService.getInfo(list, p -> p.getEmail());
        PersonsService.print(emailList);

        System.out.println();
        System.out.println("Список телефонов: ");
        List<String> phoneList = PersonsService.getInfo(list, p -> p.getPhone());
        PersonsService.print(phoneList);

        System.out.println();
        System.out.println("Список адресов в виде строк");
        List<String> strAddressLst = PersonsService.getInfo(list, p -> p.getAddress().toString());
        PersonsService.print(strAddressLst);

    }
}
