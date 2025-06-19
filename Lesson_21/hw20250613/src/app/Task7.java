package app;
// дан массив int найти самое маленькое значение в этом массиве
public class Task7 {
    public static void main(String[] args) {
        int[] arr = {10,2,5,21,2,10,7,3,9};
        int min = arr[0];   // минимальное значение
        for (int i = 1; i< arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Минимальное значение в массиве: " + min);
    }
}
