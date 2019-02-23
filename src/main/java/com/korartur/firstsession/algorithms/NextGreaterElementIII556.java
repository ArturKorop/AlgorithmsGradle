package com.korartur.firstsession.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NextGreaterElementIII556 {

    public int nextGreaterElement(int n) {
        if(n < 10) return -1;

        int temp = n;
        List<Integer> items = new ArrayList<>();
        while (temp > 0)
        {
            int q = temp % 10;
            items.add(q);
            temp = temp/10;
        }

        Integer[] ar = new Integer[items.size()];
        for (int i = 0; i < items.size(); i++) {
            ar[i] = items.get(i);
        }

        for (int i = 1; i < ar.length; i++) {
            for(int t = 0; t < i; t++){
                if(ar[i] < ar[t]){
                    int tempI = ar[i];
                    ar[i] = ar[t];
                    ar[t] = tempI;

                    Arrays.sort(ar, 0, i, Comparator.reverseOrder());

                    long res = 0;
                    int mult = 1;

                    for (int i1 = 0; i1 < ar.length; i1++) {
                        long q = ar[i1];
                        res += q * mult;
                        mult *= 10;
                    }

                    return res > Integer.MAX_VALUE ? -1 : (int)res;
                }
            }
        }


        return -1;

    }
}
