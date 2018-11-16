package dadimalanta;

public class MyNode<T> {
    private T value = null;
    private MyNode next = null;
    private MyNode left = null;
    private MyNode right = null;

    public MyNode (T value){
        this.value = value;
    }

    public T getVal(){
        return this.value;
    }

    public MyNode<T> getNext(){
        return this.next;
    }

    public MyNode<T> getLeft(){
        return this.left;
    }

    public MyNode<T> getRight(){
        return this.right;
    }

    public void setVal(T value){
        this.value = value;
    }

    public void setNext(MyNode<T> next){
        this.next = next;
    }

    public void setLeft(MyNode<T> left){
        this.left = left;
    }

    public void setRight(MyNode<T> right){
        this.right = right;
    }

    public void remove(){
        this.next = null;
        this.value = null;
    }


}
