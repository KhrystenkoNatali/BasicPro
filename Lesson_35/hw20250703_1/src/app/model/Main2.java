package app.model;

public class Main2 {
    private static int numberOfUser;
    private static boolean isServiceOk;
    private static String msg;



    public static void main(String[] args) {

        /*
        String result = "";
        if (isDrive){
            result = "плывем";
        } else {
            result = "стоим у причала";
        }
        */
        //?
        //String result = 9>6 && k!=null || b>10 ? "плывем" : "стоим у причала";



        boolean isDrive=false;
        String result = isDrive ? "плывем" : "стоим у причала";
        System.out.println(result);

        System.out.println(numberOfUser);
        System.out.println(isServiceOk);
        System.out.println(msg);

    }
}
