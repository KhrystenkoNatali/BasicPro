package app;

import app.model.Person;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        String filePath = "D:/ait-tr/cohort68M/basic_programming/lesson_50/persons.txt";

        List<String> list = readFile("./lesson_50/persons.txt");
        //List<String> list = readFile(filePath);
        StringToPersonFunction stringToPersonFunction = new StringToPersonFunction();
        List<Person> people = list.stream()
                .map(stringToPersonFunction)
                .toList();

        people.forEach(p-> System.out.println(p));
    }

    public static List<String> readFile(String fileName){
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines().toList();
        } catch (IOException ex){
            throw new RuntimeException("read file error");
        }
    }


}

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

