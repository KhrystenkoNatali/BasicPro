/*
Дано: Массивный двойной результат из 12 оценок —
каждый важный доход от продаж за соответствующий месяц. Ваша задача:

подсчитать доход за весь год
найти месяц (номер месяца) с самым большим доходом
 */
package app;

// Группа 68m

public class Main1 {
    public static void main(String[] args) {

        int[] incomes = {110, 150, 110, 180, 170, 160, 200, 210, 190, 220, 175, 165};

        int total = 0;
        int maxIncome = incomes[0];
        int maxMonth = 1;

        for (int i = 0; i < incomes.length; i++) {
            total += incomes[i];

            if (incomes[i] > maxIncome) {
                maxIncome = incomes[i];
                maxMonth = i + 1;
            }
        }

        System.out.println("Общий доход за год: " + total);
        System.out.println("Месяц с самым большим доходом: " + maxMonth);

    }
}
