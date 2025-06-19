package app;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        /*
                hello java

        h
        e
        l
        l
        o

        j
        a
        v
        a

        str.charAt(0)
        str.charAt(1)
        str.charAt(2)
        ......
        str.charAt (str.length - 1)

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        //String inputString = "hello java";

        int index = 0;
        while ( index < inputString.length()  ){
            System.out.println(  inputString.charAt(index)   );
            index++;
        }

        System.out.println(" ------------------------------------ ");
        for ( index = 0 ;  index < inputString.length() ;   index++ ){
            System.out.println(  inputString.charAt(index)   );
        }

        System.out.println(" -------------- reverse ---------------------- ");
        index = inputString.length() - 1;
        while (index >= 0){
            System.out.println(  inputString.charAt(index)   );
            index--;
        }

        System.out.println(" ---------- без l");
        index = 0;
        String result = "";
        while (index < inputString.length()){
            if (inputString.charAt(index) != 'l') {
                result += inputString.charAt(index);
            }

            index++;
        }
        System.out.println(result);

    }
}
