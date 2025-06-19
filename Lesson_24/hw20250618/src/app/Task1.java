package app;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] result1 = reverseArray(array);
        int[] result2 = reverseArray2(array);

        System.out.println("Исходный:");
        print(array);
        System.out.println("Результат:");
        print(result1);
        print(result2);





    }

    public static int[] reverseArray(int[] array){
        int[] result = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            result[ array.length -1 - i ] = array[i];
        }
        return result;
    }

    public static int[] reverseArray2(int[] array){
        int[] result = new int[array.length];
        int j = array.length; // индекс в массиве копии
        for (int i = 0; i < array.length ; i++) {
            result[--j] = array[i];

        }
        return result;
    }


    public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }


}
/*
Написать метод, который создает и возвращает новый массив который является
копией исходного, но в обратном порядке
{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}

 */

