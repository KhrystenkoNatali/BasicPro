package app.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    public static <T>void print(List<T> list){
        for (T element: list){
            System.out.println(element);
        }
    }

    public static <T> Map<T,Integer> countFrequency(List<T> list){
        Map<T,Integer> result = new LinkedHashMap<>();
        for (var element: list){
            result.put (element, result.getOrDefault(element,0)+1);
        }
        return result;
    }
}
