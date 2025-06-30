package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = inputStrings();
        System.out.println(list);
        String shortestString = shortestString(list);
        System.out.println("самая короткая строка: " + shortestString);
        String longestString = longestString(list);
        System.out.println("самая длинная строка: " + longestString);


    }

    public static String shortestString (ArrayList<String> list){
        if (list.size() == 0){
            return "";
        }
        String shortestString = list.get(0);
        for (int i = 0; i < list.size() ; i++) {
            String element= list.get(i);  // list[i]
            if (element.length() < shortestString.length()){
                shortestString = element;
            }
        }
        return shortestString;
    }


    public static String longestString (ArrayList<String> list){
        if (list.size() == 0){
            return "";
        }
        String longestString = list.get(0);
        for (int i = 0; i < list.size() ; i++) {
            String element= list.get(i);  // list[i]
            if (element.length() > longestString.length()){
                longestString = element;
            }
        }
        return longestString;
    }




    public static ArrayList<String> inputStrings(){
        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Введите очередную строку или \"exit\" для завершения");
            String inputString = scanner.nextLine();
            if(inputString.equalsIgnoreCase("exit")){
                break;
            } else {
                if (!inputString.isBlank()) {
                    list.add(inputString);
                }
            }
        } while (true);
        return list;
    }


}
