package app;

import app.model.Person;

import java.util.function.Function;

// lena,17,lena@mail.com
public class StringToPersonFunction implements Function <String, Person> {
    @Override
    public Person apply(String s) {
        String[] arr = s.split(",");
        return new Person(arr[0], Integer.parseInt( arr[1] ) , arr[2] );
    }
}
