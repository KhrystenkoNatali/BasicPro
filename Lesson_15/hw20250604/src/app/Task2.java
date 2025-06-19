package app;
/*
Обратная задача.  Исходные данные программы:
строка вида
Написать программу, которая разбирает строку на  три переменные:
- имя
- отчество
- фамилия

Подсказка: Вам понадобятся методы строки indexOf(), lastIndexOf() и substring()
*/
    public class Task2 {

            public static void main(String[] args) {

                String fullNameString  = "Тимур Николаевич Ли";

                //-----


                int firstSpace = fullNameString.indexOf(" ");  // нашли индекс первого пробела
                int lastSpace = fullNameString.lastIndexOf(" ");  // нашли индекс последнего пробела

                String name1 = fullNameString.substring(0,firstSpace);
                String name2 = fullNameString.substring(firstSpace+1, lastSpace);
                String name3 = fullNameString.substring(lastSpace+1);

                System.out.println(name1);
                System.out.println(name2);
                System.out.println(name3);




            }
}
