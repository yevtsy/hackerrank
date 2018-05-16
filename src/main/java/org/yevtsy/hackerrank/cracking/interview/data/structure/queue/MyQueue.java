package org.yevtsy.hackerrank.cracking.interview.data.structure.queue;

import java.util.Stack;

public class MyQueue<T> {
    private Stack<T> main = new Stack<>();
    private Stack<T> tmp = new Stack<>();

    public void enqueue(T value) {
        main.push(value);
    }

    public void dequeue() {
        if (main.isEmpty() && tmp.isEmpty()) {
            return;
        }

        reorderFlush();
        tmp.pop();
    }

    public T peek() {
        if (main.isEmpty() && tmp.isEmpty()) {
            return null;
        }

        reorderFlush();
        return tmp.peek();
    }

    private void reorderFlush() {
        if (tmp.isEmpty()) {
            while (!main.isEmpty()) {
                tmp.push(main.pop());
            }
        }
    }
}
