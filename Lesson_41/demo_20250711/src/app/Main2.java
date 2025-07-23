package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        int size = 100_000;
        //List<Integer> list = new ArrayList<>(size); // внутри создается сразу массив размера size
        List<Integer> list = new LinkedList<>(); // внутри создается сразу массив размера size

        addElements(list,size);
        System.out.println("лист заполнили. Считаем сумму");
        System.out.println("start метод с циклом for i");
        long sum = sum(list);
        System.out.println("start метод с циклом for i: " + sum);

        System.out.println();
        System.out.println("start метод с циклом for each");
        sum = sum2(list);
        System.out.println("start метод с циклом for each: " + sum);

    }

    public static void addElements(List<Integer> list, int size){
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
    }

    public static long sum(List<Integer> list){
        long sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+= list.get(i);
        }
        return sum;
    }

    public static long sum2(List<Integer> list){
        long sum = 0;
        for (Integer i: list) {
            sum+= i;
        }
        return sum;
    }

}
