/*
Дана строка с именами вида Jack,John,Nick,John.
Необходимо написать метод, который удалит из этой строки повторяющиеся имена.
Т.е. например, в случае строки  “Jack,John,Nick,John” вернет строку  с именами  Jack,John,Nick


 */
package app;

import app.util.StringUtil;

public class Main {
    public static void main(String[] args) {
        String names = "Jack,John,Nick,John";
        String uniqueNames = StringUtil.removeDuplicates(names);
        System.out.println("Результат: " + uniqueNames);
    }
}
