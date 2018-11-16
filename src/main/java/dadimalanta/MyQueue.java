package dadimalanta;

public interface MyQueue<T> {
    void push(T object);
    T pop();
    T peek();
    int size();
    boolean isEmpty();
}
