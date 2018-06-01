package org.yevtsy.hackerrank.cracking.interview.data.structure.bst;

import org.junit.Assert;
import org.testng.annotations.Test;

public class BSTValidatorTest {

    @Test
    public void testEmptyTree() {
        Assert.assertFalse(BSTValidator.checkBST(null));
    }

    @Test
    public void testSingleTree() {
        Assert.assertFalse(BSTValidator.checkBST(Node.builder().data(0).build()));
    }

    @Test
    public void testLeftNodeViolation() {
        final Node leftNode = Node.builder().data(6)
                .left(Node.builder().data(4).build())
                .right(Node.builder().data(15).build())
                .build();
        final Node baseNode = Node.builder().data(5)
                .left(leftNode)
                .build();

        Assert.assertFalse(BSTValidator.checkBST(baseNode));
    }

    @Test
    public void testRightNodeViolation() {
        final Node rightNode = Node.builder().data(3)
                .left(Node.builder().data(1).build())
                .right(Node.builder().data(9).build())
                .build();
        final Node baseNode = Node.builder().data(5)
                .right(rightNode)
                .build();

        Assert.assertFalse(BSTValidator.checkBST(baseNode));
    }

    @Test
    public void testOnlyLeftNode() {
        final Node leftNode = Node.builder().data(3)
                .left(Node.builder().data(1).build())
                .right(Node.builder().data(4).build())
                .build();
        final Node baseNode = Node.builder().data(5)
                .left(leftNode)
                .build();

        Assert.assertTrue(BSTValidator.checkBST(baseNode));
    }

    @Test
    public void testOnlyRightNode() {
        final Node rightNode = Node.builder().data(10)
                .left(Node.builder().data(7).build())
                .right(Node.builder().data(15).build())
                .build();
        final Node baseNode = Node.builder().data(5)
                .right(rightNode)
                .build();

        Assert.assertTrue(BSTValidator.checkBST(baseNode));
    }

    @Test
    public void testDuplicateValues() {
        final Node baseNode = Node.builder().data(5)
                .right(Node.builder().data(5).build())
                .build();

        Assert.assertFalse(BSTValidator.checkBST(baseNode));
    }
}
