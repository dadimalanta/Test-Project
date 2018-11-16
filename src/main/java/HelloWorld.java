import dadimalanta.BinaryTree;

public class HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello World!");

        BinaryTree MyTree = new BinaryTree();

        MyTree.add(1);
        MyTree.add(3);
        MyTree.add(5);
        MyTree.add(6);
        MyTree.add(7);
        MyTree.add(9);

        MyTree.printTree();
        MyTree.balance();
    }
}