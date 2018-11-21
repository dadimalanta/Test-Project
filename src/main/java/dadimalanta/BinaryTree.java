package dadimalanta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTree<T> implements iTree<T> {
    private Node<T> root = null;
    final private int MAX = 20;

    public BinaryTree(){

    }

    @Override
    public Node<T> getRoot() {
        if (this.root != null) {
            return this.root;
        }

        return null;

    }

    @Override
    public void add(T obj) {
        if (this.root == null) {
            Node<T> node = new Node<T>(obj);
            this.root = node;
            return;
        }

        Node<T> curr = this.root;
        Queue<Node<T>> queue = new LinkedList<Node<T>>();
        queue.push(curr);
        while (!queue.isEmpty()) {
            curr = queue.pop();
            if (curr.getLeft() == null){
                Node<T> node = new Node<T>(obj);
                curr.setLeft(node);
                return;
            }
            if (curr.getRight() == null){
                Node<T> node = new Node<T>(obj);
                curr.setRight(node);
                return;
            }

            queue.push(curr.getLeft());
            queue.push(curr.getRight());

        }

    }

    @Override
    public Node<T> search(T obj){
        Node<T> curr = this.root;

        Queue<Node<T>> queue = new LinkedList<Node<T>>();
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

    @Override
    public void printTree(){
        if(this.root == null){
            return;
        }

        Node<T> curr = this.root;

        Queue<Node<T>> queue = new LinkedList<Node<T>>();
        queue.push(curr);
        while(!queue.isEmpty()){
            curr = queue.pop();

            System.out.print(curr.getVal() +  " ");

            if (curr.getLeft() != null){
                queue.push(curr.getLeft());
            }
            if (curr.getRight() != null){
                queue.push(curr.getRight());
            }

        }
        return;
    }

    @Override
    public void balance(){
        List<Node<T>> objArr = new ArrayList<Node<T>>();
        Node<T> curr = this.root;
        Queue<Node<T>> queue = new LinkedList<Node<T>>();

        queue.push(curr);

        while(!queue.isEmpty()) {
            curr = queue.pop();

            objArr.add(curr);

            if (curr.getLeft() != null){
                queue.push(curr.getLeft());
            }
            if (curr.getRight() != null){
                queue.push(curr.getRight());
            }
        }

        System.out.println(Arrays.toString(objArr.toArray()));
        /**
        curr = new Node(objArr.get(0));


        int i = 1;

        while(i < objArr.size() - 1){
            Node<T> insert = new Node(objArr.get(i));

            if ((Integer)curr.getVal() > (Integer)insert.getVal()){

                curr.setLeft(insert);
            }

            i++;
        }

        System.out.println(i);
        */

    }

}

