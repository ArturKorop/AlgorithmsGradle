package com.korartur.firstsession.algorithms3;


import java.util.PriorityQueue;

public class MedianFinder295 {

    private PriorityQueue<Integer> left = new PriorityQueue<>((a, b) -> b - a);
    private PriorityQueue<Integer> right = new PriorityQueue<>((a, b) -> a - b);

    public MedianFinder295() {
    }

    public void addNum(int num) {
        if(left.size() > 0 && num > left.peek()){
            right.offer(num);
        } else {
            left.offer(num);
        }

        if(left.size() == right.size() || left.size() == right.size() + 1) return;

        if(left.size() > right.size()){
            right.offer(left.poll());
        } else {
            left.offer(right.poll());
        }
    }

    public double findMedian() {
        if (left.size() == right.size()) {
            return (double) (left.peek() + right.peek()) / 2;
        }

        return left.peek();
    }
}
