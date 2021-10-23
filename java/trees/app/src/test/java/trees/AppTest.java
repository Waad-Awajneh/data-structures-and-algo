/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;
import trees.implemant.BinarySearchTree;
import trees.implemant.BinaryTree;
import trees.implemant.node.Node;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");

    }

    @Test
    void test1() {
        BinaryTree<Integer> binarySearchTree = new BinaryTree<>();
        binarySearchTree.insert(5);
        binarySearchTree.insert(7);
        binarySearchTree.insert(6);
        binarySearchTree.insert(10);
        binarySearchTree.insert(2);
        binarySearchTree.insert(8);
        assertEquals(true, binarySearchTree.contains(10), "app should have a greeting");
        assertEquals(false, binarySearchTree.isEmpty(), "app should have a greeting");

    }

    @Test
    void test13() {
        BinaryTree<Integer> binarySearchTree = new BinaryTree<>();
        binarySearchTree.insert(5);
        binarySearchTree.insert(7);
        binarySearchTree.insert(6);
        binarySearchTree.insert(10);
        binarySearchTree.insert(2);
        binarySearchTree.insert(8);
        assertEquals(false, binarySearchTree.isEmpty(), "app should have a greeting");

    }

    @Test
    void testmax() {

        BinaryTree<Integer> binarySearchTree = new BinaryTree<>();
        binarySearchTree.insert(5);
        binarySearchTree.insert(7);
        binarySearchTree.insert(6);
        binarySearchTree.insert(10);
        binarySearchTree.insert(2);
        binarySearchTree.insert(8);
        assertEquals(10, binarySearchTree.findMaxValue());
    }
    @Test
    void testmax2() {

        BinaryTree<Integer> binarySearchTree = new BinaryTree<>();

        assertEquals(0, binarySearchTree.findMaxValue());
    }
    @Test
    void testmax3() {
        Node<Integer> node4 = new Node(7);
        Node<Integer> node5 = new Node(8);
        Node<Integer> node6 = new Node(11);

        Node<Integer> node2 = new Node(9, node4, node5);
        Node<Integer> node3 = new Node(12, node6, null);
        Node<Integer> root = new Node(10, node2, node3);
        BinaryTree binaryTree = new BinaryTree();
        assertEquals("[10, 9, 12, 7, 8, 11]", binaryTree.breadthFirst(root).toString());
    }
}
