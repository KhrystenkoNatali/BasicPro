package app;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println("Исходный:");
        print(array);

        reverseArray(array);
        System.out.println("Результат:");
        print(array);

    }
    public static void reverseArray(int[] array){
        int l = 0;
        int r = array.length-1;
        while ( l < r ){
            swap(array, l++ , r--);
        }

    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }


}
/*
### Задача 2
Написать метод, который разворачивает данный (т.е. исходный) массив в обратном порядке
{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
 */

