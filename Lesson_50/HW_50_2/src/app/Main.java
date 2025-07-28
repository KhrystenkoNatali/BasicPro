/*
Пусть дан текстовый файл, с информацией о Person
~~~
jack,32,jack@mail.com
john,21,john@mail.com
ann,5,ann@mail.com
lena,17,lena@mail.com
~~~
т.е. имя, возраст, email . Ваша задача получить список Person

 */
package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String filename = "persons.txt";
        ArrayList<Person> persons = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());
                    String email = parts[2].trim();
                    Person person = new Person(name, age, email);
                    persons.add(person);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }

        for (Person p : persons) {
            System.out.println(p);
        }
    }

}
