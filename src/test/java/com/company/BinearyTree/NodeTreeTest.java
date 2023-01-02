package com.company.BinearyTree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class NodeTreeTest {
    /**
     * Method under test: {@link NodeTree#createNewNode(int)}
     */
    @Test
    public void testCreateNewNode() {
        Node actualCreateNewNodeResult = (new NodeTree()).createNewNode(42);
        assertEquals(42, actualCreateNewNodeResult.data);
        assertNull(actualCreateNewNodeResult.right);
        assertNull(actualCreateNewNodeResult.left);
    }

    /**
     * Method under test: {@link NodeTree#getSumAllNode(Node)}
     */
    @Test
    public void testGetSumAllNode() {
        NodeTree nodeTree = new NodeTree();
        assertEquals(0, nodeTree.getSumAllNode(new Node()));
    }

    /**
     * Method under test: {@link NodeTree#inorder(Node)}
     */
    @Test
    public void testInorder() {
        NodeTree nodeTree = new NodeTree();
        Node node = new Node();
        nodeTree.inorder(node);
        assertEquals(0, node.data);
    }

    /**
     * Method under test: {@link NodeTree#postorder(Node)}
     */
    @Test
    public void testPostorder() {
        NodeTree nodeTree = new NodeTree();
        Node node = new Node();
        nodeTree.postorder(node);
        assertEquals(0, node.data);
    }

    /**
     * Method under test: {@link NodeTree#preorder(Node)}
     */
    @Test
    public void testPreorder() {
        NodeTree nodeTree = new NodeTree();
        Node node = new Node();
        nodeTree.preorder(node);
        assertEquals(0, node.data);
    }
}

