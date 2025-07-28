package app;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = inputStrings();

        writeFile(list);
        List<String> readList = readFile();

        System.out.println("--------------------------------");
        readList.forEach(System.out::println);
    }

    public static void writeFile(List<String> list){
        try (BufferedWriter writer =  new BufferedWriter(new FileWriter("out.txt"))  ) {
            for (String str:list){
                writer.write(str );
                writer.newLine();
            };
        } catch (IOException ex){
            throw new RuntimeException("Не смогли записать файл ... ", ex);
        }
    }

    public static List<String> readFile(){
        try(BufferedReader reader = new BufferedReader(new FileReader("out.txt"))) {
            return reader.lines().toList();
        } catch (IOException ex){
            throw  new RuntimeException("Не смогли прочитать файл ... ", ex);
        }

    }


    public static List<String> inputStrings(){
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Введите строки или 'exit' для выхода: ");
        System.out.println();

        while (true) {
            String str = scanner.nextLine();
            if (str.trim().equalsIgnoreCase("exit")){
                break;
            }
            list.add(str);
        }
        return list;
    }
}

/*
    public static void writeFile(List<String> list){

        try (Writer writer =  new FileWriter("out.txt")  ) {
            list.forEach( str -> {
                try {                                               // !!!Обработка Exception  в lambda
                    writer.write(str + System.lineSeparator());
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException ex){
            throw new RuntimeException("Не смогли записать файл ... ", ex);
        }

 */

