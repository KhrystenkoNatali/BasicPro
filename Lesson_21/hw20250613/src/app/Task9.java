package app;
// Дан массив нйти сумму элементов массива, которые больше заданного значения
public class Task9 {
    public static void main(String[] args) {
        int[] arr = {10,10,2,3, 1,-1,-5};
        int limitValue = 5;
        long summa = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > limitValue) {
                summa += arr[i]; // summa = summa + arr[i]
            }
        }

        System.out.println("сумма элементов: " + summa);
    }
}
