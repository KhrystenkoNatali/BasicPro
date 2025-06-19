package app;

public class Main {

    public static void main(String[] args) {

        /*  1. while

            while (условие_цикла){
                тело
                    1.
                    2.
                    ....
            }

            2. for

            for ( инит  ; условие   ;  изменение  ) {
                тело цикла
            }

            3. do ... while

            do{
              тело
            } while ( условие );


         */


        System.out.println("-------  while --------");
        int a = 0;
        while (a < 3){
            System.out.println("a = " + a);
            a++;  // a = a + 1     a+=1
        }

        System.out.println("-------  for --------");
        for ( a = 0 ;  a < 3   ;  a++ ){
            System.out.println("a = " + a);
        }

        System.out.println("-------  do .. while --------");
        a = 0;
        do {
            System.out.println("a = " + a);
            a++;  // a = a + 1     a+=1
        } while (a < 3);





    }
}
