package com.korartur.firstsession.algorithms3;

public class CountingBits338 {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;

        int nextPow2 = 1;
        int prevPow2 = 0;
        for (int i = 1; i <= num; i++) {
            if (i == nextPow2) {
                res[i] = 1;
                nextPow2 = 2 * i;
                prevPow2 = i;
            } else {
                res[i] = 1 + res[i - prevPow2];
            }
        }

        return res;
    }
}
