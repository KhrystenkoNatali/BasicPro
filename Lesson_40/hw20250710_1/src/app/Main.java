package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Jack");
        myList.add("Ann");
        myList.add("John");
        myList.add("Nick");
        myList.add("N");
        myList.add("S");
        myList.add("L");



        System.out.println(join(myList));
        remove(myList);
        System.out.println(myList);

    }

    public static void remove(List<String> list){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            if(element.length()<3){
                iterator.remove();
            }
        }
    }



    public static String join(List<String> list){
        String str = "";
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            str += element;
            if(iterator.hasNext()){
                str+= ",";
            }



        }

        return str;
    }
}
