package app;

public class Task1 {
    public static void main(String[] args) {
        double[] incomeArr = { 10.0, 10.0, 10.0,
                15.0, 10.0, 10.0,
                10.0, 10.0, 10.0,
                10.0, 25.3, 10.0};

        double totalIncome = 0; // сумма дохода
        int indexMaxMonth = 0; // номер месяца с max доходом
        double maxMonthIncome = incomeArr[0]; // максимальный доход за один месяц
        String[] month ={"Январь", "Февраль", "Март", "Апрель", "Июнь", "Июль",
                "август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

        for (int i = 0; i < incomeArr.length; i++)     {
            totalIncome += incomeArr[i];

            if (incomeArr[indexMaxMonth] < incomeArr[i]){
                indexMaxMonth = i;
                maxMonthIncome = incomeArr[i];
            }

        }

        System.out.println("Сумма дохода за год: " + totalIncome);
        System.out.println("Самый доходный месяц: " + (indexMaxMonth+1));
        System.out.println("Самый доходный месяц: " + month[indexMaxMonth]);
        System.out.println("Доход в этм месяце составил: " + incomeArr[indexMaxMonth] );


    }
}
