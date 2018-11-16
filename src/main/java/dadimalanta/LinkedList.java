package dadimalanta;

public class LinkedList<T> implements MyQueue<T>{

    private MyNode<T> head = null;

    public LinkedList(){

    }
    /**
    LinkedList(MyNode<T> node){
        this.head = node;
    }
    */


    @Override
    public void push(T obj){
        if (this.head == null){
            this.head = new MyNode<T>(obj);
        }else{
            MyNode<T> curr = this.head;
            while(curr.getNext() != null){
                curr = curr.getNext();
            }
            curr.setNext(new MyNode<T>(obj));
        }
    }

    @Override
    public T pop(){
        if (this.head == null) {
            return null;
        }

        //find way to remove head obj completely
        MyNode<T> curr = this.head;
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
        MyNode<T> curr = this.head;
        while((curr.getNext() != null) && (curr != null)){
            count++;
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

