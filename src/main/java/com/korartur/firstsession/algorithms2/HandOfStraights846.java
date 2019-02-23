package com.korartur.firstsession.algorithms2;

import java.util.Arrays;

public class HandOfStraights846 {

    public boolean isNStraightHand(int[] hand, int W) {
        if(hand.length % W != 0) return false;

        Arrays.sort(hand);

        Node n = new Node();
        n.value = hand[0];
        Node head = n;
        for (int i = 1; i < hand.length; i++) {
            Node temp = new Node();
            temp.value = hand[i];
            n.next = temp;
            n = temp;
        }

        for(int i = 0; i < hand.length / W; i++){


            int prev = head.value;
            head = head.next;

            int count = 1;
            Node root = new Node();
            root.next = head;
            Node temp = root;

            while (count < W && temp.next != null){
                if(temp.next.value - 1 == prev){
                    count++;
                    prev++;
                    temp.next = temp.next.next;
                } else {
                    if(temp.next.value == prev){
                        temp = temp.next;
                    } else {
                        return false;
                    }
                }
            }

            head = root.next;
            if(count < W) return false;
        }

        return true;
    }

    private class Node{
        public int value;
        public Node next;
    }


}
