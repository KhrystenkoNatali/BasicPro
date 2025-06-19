package app;

public class Mein3 {

    public static void main(String[] args) {
        boolean isMorning = false;
        boolean isEvening = true;

        boolean isSummer = true;
        boolean isWinter = false;

        System.out.println( "isMorning || isEvening = " + (isMorning || isEvening) ); //true
        System.out.println( "isMorning && isEvening = " + (isMorning && isEvening) ); // false

        boolean isSummerOrWinterEvening = (isWinter && isEvening) || (isSummer && isEvening);
        System.out.println("isSummerOrWinterEvening = " + isSummerOrWinterEvening);

     /*
        if (){

        } else {

        }
      */

        if (isSummerOrWinterEvening) {
            System.out.println("сейчас летний или зимний вечер");
            System.out.println("зажигаем свечи");
        } else {
            System.out.println("сейчас не летний или не зимний вечер");
        }


        if(isSummer){
            System.out.println("Загораем");
        }else {
            System.out.println("мерзнем");
        }
    }
}
