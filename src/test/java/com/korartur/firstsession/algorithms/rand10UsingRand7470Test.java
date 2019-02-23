package com.korartur.firstsession.algorithms;

import org.junit.Test;

public class rand10UsingRand7470Test {

    @Test
    public void Test(){
        rand10UsingRand7470 r = new rand10UsingRand7470();

        int count = 10000000;
        int[] res = new int[count];
        for (int i = 0; i < count; i++) {
            res[i] = r.rand10();
        }

        int[] st = new int[10];
        for (int i = 0; i < count; i++) {
            st[res[i]-1]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(((double) st[i] * 100/count) + " ");
        }
    }
}
