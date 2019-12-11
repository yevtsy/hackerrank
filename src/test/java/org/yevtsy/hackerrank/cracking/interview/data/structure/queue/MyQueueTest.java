package org.yevtsy.hackerrank.cracking.interview.data.structure.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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

    @Test
    public void enqueueDequeuePeek() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(42);
        queue.dequeue();
        queue.enqueue(14);
        assertEquals((int) queue.peek(), 14);
        queue.enqueue(28);
        assertEquals((int) queue.peek(), 14);
        queue.enqueue(60);
        queue.enqueue(78);
        queue.dequeue();
        queue.dequeue();
    }
}
