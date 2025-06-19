package app;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {10,5,-1,4,14};

        // вывод на экран массива
        for (int i  = 0; i  < arr.length ; i ++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        // ищем индекс минимального элемента ( c 0 ... )
        int indexMin = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < arr[indexMin] ){
                indexMin = i;
            }
        }

        // переставляем элемент 0 с элементом с индексом indexMin
        int temp = arr[0];
        arr[0] = arr[indexMin];
        arr[indexMin] = temp;

    }
}
