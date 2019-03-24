package com.korartur.secondsession.algorithms3;

import java.util.HashSet;

public class HappyNumber202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n > 1 && !set.contains(n)){
            set.add(n);
            n = calc(n);
        }

        return n == 1;
    }

    private int calc(int value){
        int result = 0;
        while(value > 0){
            int part = value % 10;
            result += part * part;
            value = value / 10;
        }

        return result;
    }
}
