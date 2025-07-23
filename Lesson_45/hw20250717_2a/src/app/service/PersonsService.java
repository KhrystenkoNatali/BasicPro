package app.service;

import app.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PersonsService {
    public static <T> List<T> getInfo(List<Person> list, PersonToStringFunction<T> function){
        List<T> result = new ArrayList<>();
        for (var element: list){
            result.add( function.apply(element)   );
        }
        return result;
    }

    /*
        T - тип данных, который принимаем
        R - тип результата
     */
    public static <T,R> List<R> getInfo2(List<T> list, MyFunction<T,R> function){
        List<R> result = new ArrayList<>();
        for (var element: list){
            result.add( function.apply(element)   );
        }
        return result;
    }


    public static <T,R> List<R> getInfo3(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
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
