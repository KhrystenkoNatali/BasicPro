/*
Напишите два метода,

int minIndex(int[] arr)метод, который получает массив,
    возращает индекс минимального элемента в этом массиве
int maxIndex(int[] arr)Метод, который получает массив,
    возращает индекс максимального элемента в этом массиве, используя эти два метода,
    написав программу, которая меняет местами создания массива элементов с
    максимальным элементом массива.
 */
package app;

public class Main2 {

    public static int minIndex(int[] arr) {
        int minIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int maxIndex(int[] arr) {
        int maxIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static void main(String[] args) {

        int[] array = {5, 9, 2, 7, 10, 3};

        System.out.println("Исходный массив:");
        printArray(array);

        int min = minIndex(array);

        int max = maxIndex(array);

        int temp = array[min];
        array[min] = array[max];
        array[max] = temp;

        System.out.println("\nМассив после замены минимального и максимального элементов:");
        printArray(array);
    }

    public static void printArray(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();

    }
}
