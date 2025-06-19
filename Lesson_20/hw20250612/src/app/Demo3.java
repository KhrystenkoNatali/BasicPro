package app;

public class Demo3 {
    public static void main(String[] args) {
        // "j. jackson"

        String[] names =  {"jack jackson", "lena shuman", "ira brown", "vlad petrov"};

        for (int i=0; i< names.length; i++ ){
            System.out.println(names[i]);
        }

        String[] shortNames = new String[names.length];
        for ( int i=0; i< names.length; i++){
            String name = names[i]; // взяли в name одно имя из массива names
            shortNames[i] = name.charAt(0)+"." + name.substring(name.indexOf(" "));
        }

        System.out.println("--------------------");
        for (int i = 0; i < shortNames.length; i++) {
            System.out.println(shortNames[i]);
        }

        //System.out.println(shortNames[10]);   // Error ArrayIndexOutOfBoundsException
    }
}
