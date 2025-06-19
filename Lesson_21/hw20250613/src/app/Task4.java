package app;
// создать копию заданного массива
public class Task4 {
    public static void main(String[] args) {

        int[] arr = {10,-3,0,21,2,0,7};
        int[] copyArr = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            copyArr[i] = arr[i];
        }

        System.out.println("Исходный массив:");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + "   ");
        }
        System.out.println();
        System.out.println("массив копия:");
        for (int i = 0; i < copyArr.length ; i++) {
            System.out.print(copyArr[i] + "   ");
        }

    }
}
