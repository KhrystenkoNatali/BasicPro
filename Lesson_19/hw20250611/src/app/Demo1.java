package app;

public class Demo1 {
    public static void main(String[] args) {

        int i;
        for (i = 0; i < 10; i++){
            System.out.println(i);
            if (i == 5){
                break;
            }

        }
        System.out.println("finish " + i);
    }
}
