package com.koratur.algorithms;

public class AsteroidCollision735 {
    public int[] asteroidCollision(int[] asteroids) {
        if(asteroids.length < 2) return asteroids;

        Node root = new Node(asteroids[0]);
        Node temp = root;

        for(int i = 1; i < asteroids.length; i++){
            Node n = new Node(asteroids[i]);
            temp.next = n;
            n.prev = temp;
            temp = n;
        }

        int count = 0;
        temp = root;
        while (temp != null && temp.next != null){
            if((temp.value > 0 && temp.next.value > 0) || (temp.value < 0 && temp.value < 0)){
                temp = temp.next;
            } else {

                if(temp.value == -temp.next.value){

                    count+=2;
                    Node next = temp.next.next;
                    Node prev = temp.prev;

                    if(prev == null && next == null){
                        temp = null;
                    } else if (prev == null){
                        next.prev = null;
                        temp = next;
                    } else if(next == null) {
                        prev.next = null;
                        temp = prev;
                    } else {
                        prev.next = next;
                        next.prev = prev;
                        temp = prev;
                    }

                } else if(Math.abs(temp.value) > Math.abs(temp.next.value)){
                    count++;
                    Node nextNext = temp.next.next;
                    temp.next = nextNext;
                    if(nextNext != null){
                        nextNext.prev = temp;
                    }
                } else {
                    count++;
                    Node prev = temp.prev;
                    if(prev == null){
                        temp = temp.next;
                        temp.prev = null;
                    } else {
                        Node next = temp.next;
                        prev.next = next;
                        next.prev = prev;
                        temp = prev;
                    }
                }
            }
        }

        if(temp == null) return new int[]{};

        while (temp.prev != null){
            temp = temp.prev;
        }


        int[] res = new int[asteroids.length - count];
        int i = 0;
        while(temp != null){
            res[i] = temp.value;
            temp = temp.next;
            i++;
        }

        return res;

    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int v){
            value = v;
        }
    }
}
