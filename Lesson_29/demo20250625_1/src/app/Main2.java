package app;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("mike");
        list.add("lena");
        list.add("nick");
        System.out.println(list);

        // перебор элементов листа по индексу
        for (int i = 0; i < list.size() ; i++) {
            String element = list.get(i);
            System.out.println(element);
        }
        System.out.println("---------------- for..each ");
        // перебор через for..each
        for (String element : list){
            System.out.println(element);
        }

        System.out.println("------------");
        int[] ints = {1,0,6,10};
        int sum = 0;
        for (int num : ints){
            sum+=num;
        }
        System.out.println(sum);



    }
}
