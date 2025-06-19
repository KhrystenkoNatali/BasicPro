package app;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {12,15,1,3,8,-1,-17,5};
        System.out.println("Исходный массив:");
        print(arr);
        int minIndex = minIndex(arr);
        int maxIndex = maxIndex(arr);
        System.out.println(" индекс минимального элемента:" + minIndex);
        System.out.println(" индекс максимального элемента:" + maxIndex);

        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

        System.out.println("Результат:");
        print(arr);


    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }


    public static int minIndex(int[] arr){

        int minIndex = 0;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[minIndex] > arr [i]){
                minIndex = i;
            }
        }
        return minIndex;
    }


    public static int maxIndex(int[] arr){
        int maxIndex = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[maxIndex]< arr[i]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}

/*
Напишите два метода,
1) `int minIndex(int[] arr)` метод который получает массив, а возращает **индекс** минимального элемента в этом массиве
2) `int maxIndex(int[] arr)` метод который получает массив, а возращает **индекс** максимального элемента в этом массиве
Используя эти два метода, напишите программу, которая меняет местами минимальный элемент массива с максимальным элементом массива.
*/
