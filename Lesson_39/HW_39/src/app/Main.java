/*
 Допустим дан список строк. Используя итератор реализуйте следующие методы:
метод String join(List list),
который в качестве результата возвращает строку,
полученную соединением всех строк исходного списка через запятую.
   Пример ["jack","ann","kim"] -> jack,ann,kim
Удаляет из исходного списка все строки короче 3 символов
 */
package app;
//Группа 68m
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("an");
        list.add("kim");
        list.add("jo");
        list.add("bob");

        System.out.println("Исходный список:");
        System.out.println(list);

        String result = join(list);
        System.out.println("Результат join:");
        System.out.println(result); // jack,an,kim,jo,bob

        removeShort(list);
        System.out.println("После удаления коротких строк:");
        System.out.println(list); // [jack, kim, bob]
    }

    public static String join(List<String> list) {
        Iterator<String> iterator = list.iterator();
        StringBuilder sb = new StringBuilder();

        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(",");
            }
        }

        return sb.toString();
    }

    public static void removeShort(List<String> list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.length() < 3) {
                iterator.remove(); // безопасное удаление
            }
        }
    }
}
