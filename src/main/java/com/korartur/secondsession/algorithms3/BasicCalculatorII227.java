package com.korartur.secondsession.algorithms3;

import java.util.ArrayList;
import java.util.List;

public class BasicCalculatorII227 {
    public int calculate(String s) {
        int prev = -1;
        Entity root = new Entity();
        Entity prevEntity = null;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '*' || c == '/' || c == '+' || c == '-' || c == ' '){
                if(prev != -1) {
                    int prevNum = Integer.parseInt(s.substring(prev, i));
                    Entity numEntity = new Entity();
                    numEntity.value = prevNum;

                    if(prevEntity == null){
                        prevEntity = numEntity;
                        root.next = numEntity;
                    }
                    else{
                        numEntity.prev = prevEntity;
                        prevEntity.next = numEntity;
                        prevEntity = numEntity;
                    }

                }

                if(c != ' ') {
                    Entity opEntity = new Entity();
                    opEntity._isOperation = true;
                    opEntity.operation = c;

                    opEntity.prev = prevEntity;
                    prevEntity.next = opEntity;
                    prevEntity = opEntity;
                }

                prev = -1;
            }
            else{
                if(prev > -1) continue;
                prev = i;
            }
        }

        if(prev > -1){
            int prevNum = Integer.parseInt(s.substring(prev, s.length()));
            Entity numEntity = new Entity();
            numEntity.value = prevNum;

            if(prevEntity == null){
                prevEntity = numEntity;
                root.next = numEntity;
            }
            else{
                numEntity.prev = prevEntity;
                prevEntity.next = numEntity;
                prevEntity = numEntity;
            }
        }

        Entity temp = root.next;
        while (temp != null){
            if(temp.operation == '*'){
                int res = temp.prev.value * temp.next.value;
                temp.prev.value = res;

                Entity pr  = temp.prev;
                Entity next  =temp.next;

                pr.next = next.next;
                if(next.next != null) {
                    next.next.prev = pr;
                }
            }
            else if(temp.operation == '/'){

                int res = temp.prev.value / temp.next.value;
                temp.prev.value = res;

                Entity pr  = temp.prev;
                Entity next  =temp.next;

                pr.next = next.next;
                if(next.next != null) {
                    next.next.prev = pr;
                }
            }

            temp = temp.next;
        }


        temp = root.next;
        while (temp != null){
            if(temp.operation == '+'){
                int res = temp.prev.value + temp.next.value;
                temp.prev.value = res;

                Entity pr  = temp.prev;
                Entity next  =temp.next;

                pr.next = next.next;
                if(next.next != null) {
                    next.next.prev = pr;
                }
            }
            else if(temp.operation == '-'){

                int res = temp.prev.value - temp.next.value;
                temp.prev.value = res;

                Entity pr  = temp.prev;
                Entity next  =temp.next;

                pr.next = next.next;
                if(next.next != null) {
                    next.next.prev = pr;
                }
            }

            temp = temp.next;
        }


        return root.next.value;
    }


    private class Entity{
        public boolean _isOperation = false;
        public int value;
        public char operation;

        public Entity prev;
        public Entity next;
    }
}
