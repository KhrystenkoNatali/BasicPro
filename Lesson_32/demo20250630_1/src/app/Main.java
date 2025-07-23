package app;

public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree(1, 150);
        Tree tree2 = new Tree(2, 130);
        System.out.println(tree1);
        System.out.println(tree2);

        Tree.maxHeight = 100;
        System.out.println("---------------------");
        System.out.println(tree1);
        System.out.println(tree2);

        Tree.printTypeOgPlant();
        System.out.println(Tree.getMaxHeight());




    }

}
