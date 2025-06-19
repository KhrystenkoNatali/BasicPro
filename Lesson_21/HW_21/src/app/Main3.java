/*
Дан массив int. Напишите программу, которая ищет самый маленький элемент массива
и меняет его с первыми элементами (т.е. с элементом с индексом 0)
Потом меняет местами второй самый маленький элемент
с элементом с индексом 1. Например: Например: {10,5,-1,4,14} -> {-1,4,10,5,14}
 */
package app;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = {10, 5, -1, 4, 14};

        for (int i = 0; i < 2; i++) {
            int minIndex = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.print("Результат: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
