import java.io.File;

public class Main3 {
    public static void main(String[] args) {

        //File file = new File("./lesson_50/persons.txt");
        File file = new File("./lesson_50/");
        System.out.println("exists =" + file.exists());
        System.out.println("isDirectory() =" + file.isDirectory());
        System.out.println("isFile() =" + file.isFile());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (var f :files){
                System.out.println(f);
            }
        }
    }
}
