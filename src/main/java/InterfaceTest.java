import java.util.LinkedList;

public class InterfaceTest {

}
interface MyInterface <K,V>{
    K getKey();
    V getValue();

}

class MyMap<K,V>{
    int defaultsize = 10;
    int size = 0;
    Entry<K,V> [] values = new Entry[defaultsize];

    public V get(K key){
        for (int i = 0; i <= size; i++){
            if (values[i].getKey() == key){
                return values[i].getValue();
            }
        }

        return null;
    }

    LinkedList<String> list;


}

class Entry<K,V> implements MyInterface<K,V>{
    K key;
    V value;

    Entry(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public V getValue(){

        return (V) value;
    }
    @Override
    public K getKey(){

        return (K) key;
    }

    public void setValue(V value){
        this.value = value;
    }
}


