package com.korartur.secondsession.algorithms3;

public class BitwiseAnd201 {
    public int rangeBitwiseAnd(int m, int n) {
        if(m == n) return m;

        int mlog = (int)log2(m);
        int nlog = (int)log2(n);

        if(mlog != nlog) return 0;

        long res = m;
        for(long i = m+1; i <= n; i++){
            res &= i;
        }

        return (int)res;
    }

    private double log2(int value){
        return Math.log(value) / Math.log(2);
    }
}
