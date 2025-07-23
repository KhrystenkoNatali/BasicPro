/*
В проекте с нашей реализацией листов, реализуйте Iterator у MyArrayList
 */
package app;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("jack");
        list.add("an");
        list.add("kim");
        list.add("jo");
        list.add("bob");

        System.out.println("Исходный список:");
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("\nУдаление строк короче 3 символов:");
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.length() < 3) {
                iterator.remove();
            }
        }

        System.out.println("\nПосле удаления:");
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("\nРезультат join:");
        System.out.println(join(list));
    }

    public static String join(MyArrayList<String> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
