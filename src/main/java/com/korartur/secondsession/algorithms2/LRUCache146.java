package com.korartur.secondsession.algorithms2;

import java.util.HashMap;
import java.util.concurrent.RecursiveTask;

public class LRUCache146 {

    private LNode head = null;
    private LNode tail = null;

    private HashMap<Integer, LNode> nodeMap = new HashMap<>();

    private int capacity;

    public LRUCache146(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if(nodeMap.containsKey(key)){
            put(key, nodeMap.get(key).value);
            return nodeMap.get(key).value;
        }

        return -1;
    }

    public void put(int key, int value) {
        LNode node = new LNode();
        node.key = key;
        node.value = value;

        if(head == null){
            head = node;
            tail = node;
            nodeMap.put(key, node);
        }
        else if(nodeMap.containsKey(key)){
            node = nodeMap.get(key);
            node.value = value;

            if(node == head) return;

            if(node == tail){
                tail = node.prev;
                node.prev.next = null;
            }

            LNode prev = node.prev;
            LNode next = node.next;
            prev.next=  next;
            if(next != null) {
                next.prev = prev;
            }

            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
        }
        else{
            if(nodeMap.size() < capacity){
                head.prev = node;
                node.next = head;
                head = node;
                nodeMap.put(key, node);
            }
            else{

                nodeMap.remove(tail.key);
                if(tail.prev != null) {
                    tail.prev.next = null;
                }
                tail = tail.prev;

                put(key, value);
            }
        }
    }

    private class LNode{
        public int value;
        public int key;
        public LNode next;
        public LNode prev;
    }
}

