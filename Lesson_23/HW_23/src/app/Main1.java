/*
Написать метод, который создает и возвращает новый массив,
который является копией исходного кода,
но в обратном порядке {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
 */
package app;

//Группа 68m

public class Main1 {

    public static void main(String[] args) {
        int[] original = {10, 3, 3, 5, -9};
        int[] reversed = createReversedCopy(original);

        System.out.print("Развернутая копия: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
    public static int[] createReversedCopy(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }
}

