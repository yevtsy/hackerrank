package org.yevtsy.hackerrank.cracking.interview.data.structure.list;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class LinkedListsDetectCycleTest {

    @Test
    public void checkCycleOnlyNull() throws Exception {
        Node node = Node.builder().data(1).next(null).build();
        LinkedListsDetectCycle detector = new LinkedListsDetectCycle();
        assertFalse(detector.hasCycle(node));
    }

    @Test
    public void checkCycleSeveralNodes() throws Exception {
        Node node3 = Node.builder().data(1).next(null).build();
        Node node2 = Node.builder().data(1).next(node3).build();
        Node node1 = Node.builder().data(1).next(node2).build();
        LinkedListsDetectCycle detector = new LinkedListsDetectCycle();
        assertFalse(detector.hasCycle(node1));
    }
}