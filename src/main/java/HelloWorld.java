import dadimalanta.BinaryTree;
import dadimalanta.LinkedList;
import dadimalanta.Queue;
import dadimalanta.Stack;

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
        //MyTree.balance();


        Stack<Integer> stack = new LinkedList<Integer>();

        stack.pushS(0);
        stack.pushS(1);
        stack.pushS(2);
        stack.pushS(3);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}