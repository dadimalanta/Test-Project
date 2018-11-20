package dadimalanta;

public interface Queue<T> {
    void push(T object);
    T pop();
    T peek();
    int size();
    boolean isEmpty();
}
