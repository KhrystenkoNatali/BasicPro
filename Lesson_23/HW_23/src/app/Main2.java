/*
Написать метод, который разворачивает данный (т.е. исходный)
массив в обратном порядке {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
 */
package app;

public class Main2 {

    public static void main(String[] args) {
        int[] original = {10, 3, 3, 5, -9};
        int[] result = reverseArray(original);

        System.out.print("Развернутый массив: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }

        return reversed;
    }
}

