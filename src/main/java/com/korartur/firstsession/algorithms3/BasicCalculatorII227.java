package com.korartur.firstsession.algorithms3;

import java.util.ArrayList;
import java.util.List;

public class BasicCalculatorII227 {
    public int calculate(String s) {
        List<Node> chars = new ArrayList<>();

        int prev = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' '){
                if(prev == -1) continue;

                String part = s.substring(prev, i);
                Node n = new Node(true, Integer.parseInt(part), 'a');
                chars.add(n);
                prev = -1;
            } else {
                if(c == '/' || c == '*' || c == '+' || c == '-'){

                    if(prev != -1) {
                        String part = s.substring(prev, i);
                        Node n = new Node(true, Integer.parseInt(part), 'a');
                        chars.add(n);
                        prev = -1;
                    }
                    chars.add(new Node(false, 0, c));
                } else {
                    if(prev != -1) continue;
                    prev = i;
                }
            }
        }

        if(prev != -1){
            String part = s.substring(prev, s.length());
            Node n = new Node(true, Integer.parseInt(part), 'a');
            chars.add(n);
        }



        List<Node> temp = new ArrayList<>();
        temp.add(chars.get(0));

        for(int i = 1; i < chars.size(); i++){
            Node n = chars.get(i);
            if(n.isNumber){
                temp.add(chars.get(i));
            } else {
                if(n.operation == '/'){
                    int value = temp.get(temp.size()-1).value / chars.get(i+1).value;
                    temp.get(temp.size()-1).value = value;
                    i++;
                } else if(n.operation == '*'){
                    int value = temp.get(temp.size()-1).value * chars.get(i+1).value;
                    temp.get(temp.size()-1).value = value;
                    i++;
                } else {
                    temp.add(n);
                }
            }
        }

        if(temp.size() == 1){
            return temp.get(0).value;
        }

        chars = temp;
        int res = temp.get(0).value;
        for(int i = 1; i < chars.size(); i++){

            Node n = chars.get(i);
            if(n.operation == '+'){
                res += chars.get(i+1).value;
                i++;
            } else {
                res -= chars.get(i+1).value;
                i++;
            }
        }

       return res;

    }

    private class Node{
        public boolean isNumber;
        public int value;
        public char operation;

        public Node(boolean isNumber, int value, char operation) {
            this.isNumber = isNumber;
            this.value = value;
            this.operation = operation;
        }
    }

}
