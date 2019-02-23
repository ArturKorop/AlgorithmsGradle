package com.korartur.FirstSession.algorithms2;

public class BitwiseAndofNumbersRange201 {
    public int rangeBitwiseAnd(int m, int n) {
        if(m == n) return m;
        if(m == 0) return 0;

        for(int i = 31; i >= 0; i--){
            if(n >> i == 1){
                if(m >> i == 1){
                    int value =  1 << i;
                    return value + rangeBitwiseAnd(m - value, n -value);
                } else {
                    return 0;
                }
            }
        }

        return 0;
    }
}
