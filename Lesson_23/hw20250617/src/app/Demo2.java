package app;

public class Demo2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        print(arr);
        transform(arr);  // массив arr изменился
        print(arr);
        int[] copy = createCopy(arr);
        print(copy);
        copy[0]=10010;
        System.out.println("---------------------");
        print(arr);
        print(copy);

    }

    public static int[] createCopy(int[] array){
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            copy[i] = array[i];
        }
        return copy;
    }


    public static void transform(int[] array){
        array[0] += 100;
        array[1] += 100;
    }

    public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }
        System.out.println();
    }
}
