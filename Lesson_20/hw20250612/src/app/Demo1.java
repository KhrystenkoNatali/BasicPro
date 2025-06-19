package app;

public class Demo1 {
    public static void main(String[] args) {
        int[] intArray = {10, 19, 30, 20, 21, 40}; // заданный массив целых чисел

        System.out.println(intArray[0]); // выводим первый элемент массива
        System.out.println(intArray[1]); // выводим второй элемент массива
        intArray[0] = 1000; // записали новое значение в элемент с индексом 0
        System.out.println(intArray[0]);  //{1000,19,30,20,21,40}
        intArray[0] +=  intArray[1]; // intArray[0] = intArray[0] + intArray[1];

        // intArray.length - длинна массива
        System.out.println("Количество элементов в массиве:" + intArray.length);
        System.out.println("------------------------");
        System.out.println("Вывести весь массив:");
        // перебор всего массива
        for (int i=0; i<intArray.length; i++){
            System.out.println("["+ i + "] = " +intArray[i]);
        }

    }
}
