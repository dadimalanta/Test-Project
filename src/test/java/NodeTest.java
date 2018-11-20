import dadimalanta.Node;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class NodeTest {
    @Test
    public void testGetVal(){
        Node testNode = new Node(5);

        Object result = testNode.getVal();

        assertEquals(5,result);

    }

    @Test
    public void testGetNext(){
        Node testNode = new Node();
        Node testNodeNext = new Node();
        testNode.setNext(testNodeNext);

        Object result = testNode.getNext();
        assertEquals(testNodeNext,result);

    }
    @Test
    public void testGetLeft(){
        Node testNode = new Node();
        Node testNodeLeft = new Node();
        testNode.setLeft(testNodeLeft);

        Object result = testNode.getLeft();
        assertEquals(testNodeLeft,result);

    }

    @Test
    public void testGetRight(){
        Node testNode = new Node();
        Node testNodeRight = new Node();
        testNode.setRight(testNodeRight);

        Object result = testNode.getRight();
        assertEquals(testNodeRight,result);

    }

    @Test
    public void testRemove(){
        Node testNode = new Node();
        Node testNodeNext = new Node();
        testNode.setNext(testNodeNext);

        testNodeNext.remove();

        assertNull(testNodeNext.getNext());
        assertNull(testNodeNext.getVal());
        assertNull(testNodeNext.getLeft());
        assertNull(testNodeNext.getRight());
    }
}
