package dadimalanta;

public class Node<T> {
    private T value = null;
    private Node next = null;
    private Node left = null;
    private Node right = null;

    public Node(){
    }

    public Node(T value){
        this.value = value;
        this.next = null;
        this.right = null;
        this.left = null;
    }

    public T getVal(){
        return this.value;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public Node<T> getLeft(){
        return this.left;
    }

    public Node<T> getRight(){
        return this.right;
    }

    public void setVal(T value){
        this.value = value;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }

    public void setLeft(Node<T> left){
        this.left = left;
    }

    public void setRight(Node<T> right){
        this.right = right;
    }

    public void remove(){
        this.next = null;
        this.value = null;
        this.right = null;
        this.left = null;
    }




}
