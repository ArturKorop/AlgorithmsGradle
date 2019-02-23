package com.korartur.FirstSession.algorithms3;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses241 {
    public List<Integer> diffWaysToCompute(String input) {
        List<Node> nodes = new ArrayList<>();
        int prev = -1;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(Character.isDigit(c)){
                if(prev == -1) prev = i;
            } else {
                String part = input.substring(prev, i);
                Node n = new Node(Integer.parseInt(part));
                nodes.add(n);
                nodes.add(new Node(c));
                prev = -1;
            }
        }

        nodes.add(new Node(Integer.parseInt(input.substring(prev))));


        return getWays(nodes, 0, nodes.size()-1);
    }

    private List<Integer> getWays(List<Node> nodes, int from, int to){
        List<Integer> res = new ArrayList<>();
        if(from == to) {
            res.add(nodes.get(from).value);
            return res;
        }

        if(to - from == 2){
            int value = makeOperation(nodes.get(from).value, nodes.get(from+1), nodes.get(to).value);
            res.add(value);
            return res;
        }

        for(int i = from+1; i < to; i++){
            List<Integer> left = getWays(nodes, from, i - 1);
            List<Integer> right = getWays(nodes, i+1, to);

            for (Integer lValue : left) {
                for (Integer rValue : right) {
                    int value = makeOperation(lValue, nodes.get(i), rValue);
                    res.add(value);
                }
            }

        }

        return res;
    }

    private int makeOperation(int value1, Node operation, int value2) {
        if (operation.operation == '*') return value1 * value2;
        if (operation.operation == '/') return value1 / value2;
        if (operation.operation == '-') return value1 - value2;
        return value1 + value2;
    }

    private class Node{
        public boolean isNumber;
        public int value;
        public char operation;

        public Node(int value) {
            this.isNumber = true;
            this.value = value;
        }

        public Node(char c){
            this.isNumber = false;
            operation = c;
        }

    }
}
