package dadimalanta;

public interface iTree<T> {
    Node<T> getRoot();
    void add(T obj);
    Node<T> search(T obj);
    void printTree();
    void balance();
}
