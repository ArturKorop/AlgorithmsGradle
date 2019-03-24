package com.korartur.secondsession.algorithms3;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues225 {

    private Queue<Integer> _input = new LinkedList<>();

    /** Push element x onto stack. */
    public void push(int x) {
        Queue<Integer> temp = new LinkedList<>();
        temp.add(x);
        temp.addAll(_input);
        _input = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return _input.poll();
    }

    /** Get the top element. */
    public int top() {
        return _input.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return _input.isEmpty();
    }
}
