package com.korartur.firstsession.algorithms;

public class MyCalendarI729 {

    private Node root;
    public MyCalendarI729(){
    }

    public boolean book(int start, int end) {
        Node n = new Node(start, end);
        if(root == null){
            root = n;
            return true;
        } else {
            if(end <= root.value[0]){
                n.next = root;
                root = n;
                return true;
            }

            Node temp = root;
            Node prev = null;

            while (temp != null && temp.value[0] < start){
                prev = temp;
                temp = temp.next;
            }

            if(prev == null) return false;
            if(prev.value[1] > start) return false;

            if(temp != null && temp.value[0] <  end) return false;

            Node next = prev.next;
            prev.next = n;
            n.next = next;

            return true;

        }
    }

    private class Node{
        public int[] value;
        public Node next;

        public Node(int start, int end) {
            value = new int[]{start, end};
        }
    }
}
