package dadimalanta;

public class LinkedList<T> implements Queue<T>, Stack<T> {

    private Node<T> head = null;

    public LinkedList(){

    }
    /**
    public LinkedList(Node<T> node){
        this.head = node;
    }
    */


    @Override
    public void push(T obj){
        if (this.head == null){
            this.head = new Node<T>(obj);
        }else{
            Node<T> curr = this.head;
            while(curr.getNext() != null){
                curr = curr.getNext();
            }
            curr.setNext(new Node<T>(obj));
        }
    }

    @Override
    public void pushS(T obj){
        Node<T> head = this.head;
        if (this.head == null){
            this.head = new Node<T>(obj);
        }else{
            Node<T> curr = new Node<T>(obj);
            this.head = curr;
            this.head.setNext(head);
        }
    }

    @Override
    public T pop(){
        if (this.head == null) {
            return null;
        }

        //find way to remove head obj completely
        Node<T> curr = this.head;
        this.head = this.head.getNext();
        return curr.getVal();
    }

    @Override
    public T peek(){
        return this.head.getVal();
    }

    @Override
    public int size(){
        int count = 0;
        if (this.head == null) {
            return 0;
        }
        count++;
        Node<T> curr = this.head;
        while((curr.getNext() != null)){
            count++;
            curr = curr.getNext();
        }
        return count;
    }

    @Override
    public boolean isEmpty(){
        if (this.head != null){
            return false;
        }else{
            return true;
        }
    }


}

