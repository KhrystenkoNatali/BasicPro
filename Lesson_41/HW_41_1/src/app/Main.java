/*
Дан лист String.
Необходимо определить,
есть ли в данном листе повторяющиеся строки.
 */
package app;
//Группа 68m
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Jack", "Mike", "Anna", "Jack", "Tom");

        boolean hasDuplicates = checkDuplicates(list);

        if (hasDuplicates) {
            System.out.println("Список содержит дубликаты.");
        } else {
            System.out.println("Дубликатов нет.");
        }
    }

    public static boolean checkDuplicates(List<String> list) {
        Set<String> set = new HashSet<>();
        for (String str : list) {
            if (!set.add(str)) {
                return true; // уже есть такой элемент — дубликат найден
            }
        }
        return false;
    }
}
