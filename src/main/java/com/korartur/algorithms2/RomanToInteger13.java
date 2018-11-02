package com.korartur.algorithms2;

import java.util.HashMap;

public class RomanToInteger13 {
    public int romanToInt(String s) {
        int[] map2 = new int['Z'];
        map2['I'] = 1;
        map2['V'] = 5;
        map2['X'] = 10;
        map2['L'] = 50;
        map2['C'] = 100;
        map2['D'] = 500;
        map2['M'] = 1000;


        int[] data = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            data[i] = map2[s.charAt(i)];
        }

        int res = 0;
        int i = 0;
        while (i < data.length){
            if(i == data.length - 1){
                res += data[i];
                i++;
            } else {
                int c1 = data[i];
                int c2 = data[i+1];
                if(c1 < c2){
                    res += c2 - c1;
                    i+=2;
                } else {
                    res += c1;
                    i++;
                }
            }
        }

        return res;
    }
}
