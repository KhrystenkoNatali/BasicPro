package app;

public class Tree {
    private int number;
    private double height;
    public static double maxHeight = 500; //см  статическое поле, принадлежит класс (не объекту!)

    public Tree(int number, double height) {
        this.number = number;
        this.height = height;
    }

    public int getNumber() {
        return number;
    }

    public double getHeight() {
        return height;
    }


    //статический метод, принадлежит класс (не объекту!)
    //статический метод вызывается от класса Tree.printTypeOgPlant()
    //статический метод не может обратьтся к не статическим полям или не статическим методам

    public static void printTypeOgPlant(){
        System.out.println("Дерево!");
    }

    public static double getMaxHeight(){
        return maxHeight;
    }


    @Override
    public String toString() {
        return "Tree{" +
                "number=" + number +
                ", height=" + height +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
