package org.yevtsy.hackerrank.cracking.interview.data.structure.queue;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class MyQueueTest {

    @Test
    public void peekEmptyQueue() {
        MyQueue<Integer> queue = new MyQueue<>();
        assertNull(queue.peek());
    }

    @Test
    public void peekAfterDequeue() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.dequeue();
        assertNull(queue.peek());
    }

    @Test
    public void peekQueueValue() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        assertEquals((int) queue.peek(), 1);
    }
}
