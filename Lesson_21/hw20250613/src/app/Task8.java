package app;
// Дан массив нйти сумму элементов массива
public class Task8 {
    public static void main(String[] args) {
        int[] arr = {10,10,2,3, 1,-1,-5};
        long summa = 0;

        for (int i = 0; i < arr.length; i++) {
            summa += arr[i]; // summa = summa + arr[i]
        }

        System.out.println("сумма элементов: " + summa);

    }
}
