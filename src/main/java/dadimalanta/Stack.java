package dadimalanta;

public interface Stack<T> {
    void pushS(T object);
    T pop();
    T peek();
    int size();
    boolean isEmpty();

}
