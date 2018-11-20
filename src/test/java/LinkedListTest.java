import dadimalanta.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testPush() {
        LinkedList testList = new LinkedList();

        testList.push(0);
        testList.push(1);
        testList.push(15);
        testList.push(5);
        Object result = testList.pop();

        assertEquals(0, result);
        result = testList.pop();
        assertEquals(1, result);
        result = testList.pop();
        assertEquals(15, result);
        result = testList.pop();
        assertEquals(5, result);

    }
    @Test
    public void testPushS() {
        LinkedList testList = new LinkedList();

        testList.pushS(0);
        testList.pushS(1);
        testList.pushS(15);
        testList.pushS(5);
        Object result = testList.pop();

        assertEquals(5, result);
        result = testList.pop();
        assertEquals(15, result);
        result = testList.pop();
        assertEquals(1, result);
        result = testList.pop();
        assertEquals(0, result);

    }
    @Test
    public void testPeek() {
        LinkedList testList = new LinkedList();

        testList.push(0);
        testList.push(1);
        testList.push(15);
        testList.push(5);
        Object result = testList.pop();

        result = testList.peek();
        assertEquals(1, result);
        result = testList.pop();
        result = testList.peek();
        assertEquals(15, result);
        result = testList.pop();
        result = testList.peek();
        assertEquals(5, result);

    }

    @Test
    public void testSize() {
        LinkedList testList = new LinkedList();

        testList.push(0);
        testList.push(1);
        testList.push(15);
        testList.push(5);
        int result = testList.size();

        assertEquals(4,result);

    }

    @Test
    public void testIsEmpty() {
        LinkedList testList = new LinkedList();

        assertTrue(testList.isEmpty());

        testList.push(0);
        testList.push(1);
        testList.push(15);
        testList.push(5);

        assertFalse(testList.isEmpty());

    }
}
