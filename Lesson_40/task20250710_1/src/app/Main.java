package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Jack", "Lena", "Oleg", "Mike", "Nick", "Ann");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите способ обработки:");
            System.out.println("1. добавить ()");
            System.out.println("2. добавить []");
            System.out.println("3. toUppercase");
            System.out.println("4. добавить !");
            System.out.println("иначе завершение");

            int selectedItem = scanner.nextInt();

            StringTransformer transformer1 = new StringTransformer() {
                @Override
                public String transform(String str) {
                    return "(" + str + ")";
                }
            };
            StringTransformer transformer2 = new StringTransformer() {
                @Override
                public String transform(String str) {
                    return "[" + str + "]";
                }
            };
            StringTransformer transformer3 = new StringTransformer() {
                @Override
                public String transform(String str) {
                    return str.toUpperCase();
                }
            };
            StringTransformer transformer4 = new StringTransformer() {
                @Override
                public String transform(String str) {
                    return str + "!";
                }
            };


            List<String> result = new ArrayList<>();
            StringTransformer selectesTransformer = null;

            switch (selectedItem){
                case 1:
                    result = listHandler(list, transformer1);
                    break;
                case 2:
                    result = listHandler(list, transformer2);
                    break;
                case 3:
                    result = listHandler(list, transformer3);
                    break;
                case 4:
                    result = listHandler(list, transformer4);
                    break;
                default: return;
            }
            System.out.println(result);

        }


    }
    public static List<String> listHandler(List<String> list, StringTransformer transformer){
        List<String> result = new ArrayList<>();
        for (String str: list){
            result.add(transformer.transform(str));
        }
        return result;
    }
}
