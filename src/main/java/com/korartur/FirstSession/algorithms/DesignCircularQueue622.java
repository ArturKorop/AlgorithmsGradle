package com.korartur.FirstSession.algorithms;

public class DesignCircularQueue622 {

    public static class MyCircularQueue {

        private int[] arr;
        private int front;
        private int rear;
        private int count;
        private int k;

        /** Initialize your data structure here. Set the size of the queue to be k. */
        public MyCircularQueue(int k) {
            arr = new int[k];
            front = -1;
            rear = -1;
            count = 0;
            this.k = k;
        }

        /** Insert an element into the circular queue. Return true if the operation is successful. */
        public boolean enQueue(int value) {
            if(isFull()) return false;

            count++;

            if(front == -1 && rear == -1)
            {
                arr[0] = value;
                front = 0;
                rear = 0;

                return true;
            }

            if(rear == arr.length-1) {
                rear  = 0;
            }
            else{
                rear++;
            }

            arr[rear] = value;

            return true;
        }

        /** Delete an element from the circular queue. Return true if the operation is successful. */
        // Delete Front
        public boolean deQueue() {
            if(isEmpty())return false;

            count--;

            if(front == rear){
                front = -1;
                rear = -1;
                return true;
            }

            if(front == arr.length-1){
                front = 0;
            }
            else{
                front++;
            }

            return true;

        }

        /** Get the front item from the queue. */
        public int Front() {
            return front == -1 ? -1 : arr[front];
        }

        /** Get the last item from the queue. */
        public int Rear() {

            return rear == -1 ? -1 : arr[rear];
        }

        /** Checks whether the circular queue is empty or not. */
        public boolean isEmpty() {
            return count == 0;
        }

        /** Checks whether the circular queue is full or not. */
        public boolean isFull() {
            return count == k;
        }
    }

}
