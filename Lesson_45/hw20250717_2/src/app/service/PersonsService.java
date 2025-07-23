package app.service;

import app.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonsService {
    public static List<String> getInfo(List<Person> list, PersonToStringFunction function){
        List<String> result = new ArrayList<>();
        for (var element: list){
            result.add( function.apply(element)   );
        }
        return result;
    }

    public static <T> void print(List<T> list){
        for (T element:list){
            System.out.println(element);
        }
    }
}
