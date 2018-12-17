package com.korartur.algorithms3;

import javafx.util.Pair;

public class BasicCalculator224 {
    public int calculate(String s) {


        Node start = new Node(0);
        Node temp = start;


        int prev = -1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){

                if(prev == -1) continue;
                Node n = new Node(Integer.parseInt(s.substring(prev, i)));
                temp.next = n;
                temp = n;

                prev = -1;
            } else if(Character.isDigit(s.charAt(i))){
                if(prev == -1){
                    prev = i;
                }
            } else {
                if(prev != -1){
                    Node n = new Node(Integer.parseInt(s.substring(prev, i)));
                    temp.next = n;
                    temp = n;
                }

                Node n = new Node(s.charAt(i));
                temp.next = n;
                temp = n;
                prev = -1;
            }
        }

        if(prev != -1){
            Node n = new Node(Integer.parseInt(s.substring(prev)));
            temp.next = n;
            temp = n;
        }

        temp = start.next;

        int res = calcNode(temp);

        return res;
    }

    private Pair calcNodeOperationUntilCloseBracer(Node n1){
        Node temp = n1;
        int open = 1;
        int close = 0;
        int res = 0;
        int mult = 1;
        while (open != close){
            if(temp.NodeType == -1){
                res += (mult) * temp.value;
            } else {

                if(temp.operation == '('){

                    Pair next = calcNodeOperationUntilCloseBracer(temp.next);
                    res += (mult) * next.key;
                    temp.next = next.value;
                } else if(temp.operation == ')'){
                    close++;
                } else {
                    if(temp.operation == '+'){
                        mult = 1;
                    } else {
                        mult = -1;
                    }
                }

            }

                temp = temp.next;

        }

        return new Pair(res, temp);
    }

    private int calcNode(Node n){

        int res = 0;
        int mult = 1;

        while (n != null) {
            if (n.NodeType == -1) {
                res += (mult) * n.value;
            } else {
                if(n.operation == '('){

                    Pair next = calcNodeOperationUntilCloseBracer(n.next);
                    res += (mult) * next.key;
                    n.next = next.value;

                } else {
                    if(n.operation == '-'){
                        mult = -1;
                    } else {
                        mult = 1;
                    }
                }
            }

                n = n.next;
        }

        return res;
    }

    private class Pair{
        public int key;
        public Node value;

        public Pair(int k, Node v){
            key = k;
            value = v;
        }
    }



    // -1 - value
    // +1 - operation
    private class Node{
        public Node next;
        public int NodeType;
        public int value;
        public char operation;

        public Node(int value){
            this.value = value;
            NodeType = -1;
        }

        public Node(char operation){
            this.operation = operation;
            NodeType = 1;
        }
    }

}
