/*
Дано два массива String[] name и int[ ] YearOfBirthday одинаковой длины,
которые содержат имена и годы рождения людей.
Каждый элемент вyearsOfBirthday соответствует элементу с таким же индексом в именах.
 Реализовать программу, которая рассылает список людей (имя плюс печатный возраст),
  старше заданного int. Потом распечатать имя и возраст старшего: Например:

{“Olga”,”Oleg”,”Svetlana”,”Oleg”}
{2004,1982,2008,”2010”}
15

результат:

Olga 16 years
Oleg 38 years
_____________
Oleg 38 years is oldest
 */
package app;

public class Main2 {
    public static void main(String[] args) {

        String[] names = {"Olga", "Oleg", "Svetlana", "Oleg"};
        int[] years = {2004, 1982, 2008, 2010};

        int threshold = 15;
        int currentYear = 2025;

        String oldestName = "";
        int oldestAge = 0;

        for (int i = 0; i < names.length; i++) {
            int age = currentYear - years[i];

            if (age > threshold) {

                System.out.println(names[i] + " " + age + " years");

                if (age > oldestAge) {
                    oldestAge = age;
                    oldestName = names[i];
                }
            }
        }

        System.out.println("_____________");

        System.out.println(oldestName + " " + oldestAge + " years is oldest");

    }
}
