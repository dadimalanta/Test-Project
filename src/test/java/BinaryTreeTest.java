import dadimalanta.BinaryTree;
import dadimalanta.Node;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void testAdd(){
        BinaryTree testTree = new BinaryTree();

        String testNodeRoot = "a";
        String testNodeLeft = "b";
        String testNodeRight = "c";

        testTree.add(testNodeRoot);
        testTree.add(testNodeLeft);
        testTree.add(testNodeRight);

        Object result = testTree.getRoot();

        assertNotNull(result);
        assertNotNull(((Node) result).getLeft());
        assertNotNull(((Node) result).getRight());
        assertEquals(((Node) result).getLeft().getVal(), testNodeLeft);
        assertEquals(((Node) result).getRight().getVal(), testNodeRight);


    }

    @Test
    public void testSearch(){
        BinaryTree testTree = new BinaryTree();

        String testNode0 = "a";
        String testNode1 = "b";
        String testNode2 = "c";
        String testNode3 = "d";
        String testNode4 = "e";
        String testNode5 = "f";
        String testNode6 = "g";


        testTree.add(testNode0);
        testTree.add(testNode1);
        testTree.add(testNode2);
        testTree.add(testNode3);
        testTree.add(testNode4);
        testTree.add(testNode5);
        testTree.add(testNode6);

        Object result = testTree.search("c");

        assertNotNull(result);
        assertEquals("c",((Node) result).getVal());
        assertNotNull(((Node) result).getLeft());
        assertEquals("f",((Node) result).getLeft().getVal());
        assertNotNull(((Node) result).getRight());
        assertEquals("g",((Node) result).getRight().getVal());
    }

    @Test
    public void testPrintTree(){
        BinaryTree testTree = new BinaryTree();

        String testNode0 = "a";
        String testNode1 = "b";
        String testNode2 = "c";
        String testNode3 = "d";
        String testNode4 = "e";
        String testNode5 = "f";
        String testNode6 = "g";


        testTree.add(testNode0);
        testTree.add(testNode1);
        testTree.add(testNode2);
        testTree.add(testNode3);
        testTree.add(testNode4);
        testTree.add(testNode5);
        testTree.add(testNode6);

        testTree.printTree();
    }

}
