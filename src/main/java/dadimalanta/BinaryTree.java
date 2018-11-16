package dadimalanta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTree<T> {
    private MyNode<T> root = null;
    final private int MAX = 20;

    public BinaryTree(){

    }

    public void add(T obj) {
        if (root == null) {
            MyNode<T> node = new MyNode<T>(obj);
            this.root = node;
            return;
        }

        MyNode<T> curr = this.root;
        MyQueue<MyNode<T>> queue = new LinkedList<MyNode<T>>();
        queue.push(curr);
        while (!queue.isEmpty()) {
            curr = queue.pop();
            if (curr.getLeft() == null){
                MyNode<T> node = new MyNode<T>(obj);
                curr.setLeft(node);
                return;
            }
            if (curr.getRight() == null){
                MyNode<T> node = new MyNode<T>(obj);
                curr.setRight(node);
                return;
            }

            queue.push(curr.getLeft());
            queue.push(curr.getRight());

        }

    }

    public MyNode<T> search(T obj){
        MyNode<T> curr = this.root;

        MyQueue<MyNode<T>> queue = new LinkedList<MyNode<T>>();
        queue.push(curr);
        while(!queue.isEmpty()){
            curr = queue.pop();
            if (curr.getVal() == obj){
                return curr;
            }
            if (curr.getLeft() != null){
                queue.push(curr.getLeft());
            }
            if (curr.getRight() != null){
                queue.push(curr.getRight());
            }
        }

        return null;
    }

    public void printTree(){
        if(this.root == null){
            return;
        }

        MyNode<T> curr = this.root;

        MyQueue<MyNode<T>> queue = new LinkedList<MyNode<T>>();
        queue.push(curr);
        while(!queue.isEmpty()){
            curr = queue.pop();

            System.out.println(curr.getVal());

            if (curr.getLeft() != null){
                queue.push(curr.getLeft());
            }
            if (curr.getRight() != null){
                queue.push(curr.getRight());
            }

        }
        return;
    }

    public void balance(){
        List<Integer> objArr = new ArrayList<Integer>();
        MyNode<T> curr = this.root;
        MyQueue<MyNode<T>> queue = new LinkedList<MyNode<T>>();

        queue.push(curr);

        while(!queue.isEmpty()) {
            curr = queue.pop();

            objArr.add((int)curr.getVal());

            if (curr.getLeft() != null){
                queue.push(curr.getLeft());
            }
            if (curr.getRight() != null){
                queue.push(curr.getRight());
            }
        }

        System.out.println(Arrays.toString(objArr.toArray()));
    }

}

