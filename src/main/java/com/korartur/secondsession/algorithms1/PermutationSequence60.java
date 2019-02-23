package com.korartur.secondsession.algorithms1;

public class PermutationSequence60 {
    public String getPermutation(int n, int k) {
        int[] set = new int[n];

        for (int i = 0; i < n; i++) {
            set[i] = i  +1;
        }

        String s = "";
        if (k == 1) {
            for (int i = 0; i < set.length; i++) {
                s += set[i];
            }

            return s;
        }

        int fact = 1;
        for (int i = 0; i < n - 1; i++) {
            fact *= i + 1;
        }

        int last = n - 1;
        k--;

        while (last != 0) {

            int curPos = k / fact;
            int rem = getOnPos(set, curPos);
            s += rem;
            k = k % fact;
            fact = fact / last;
            last--;
        }

        s += getOnPos(set, 0);

        return s;
    }

    private int getOnPos(int[] set, int pos){
        for (int i = 0; i < set.length; i++) {
            if(set[i] == 0) continue;
            if(pos == 0){
                int res = set[i];
                set[i] = 0;
                return res;
            }
            pos--;
        }

        return -1;
    }

}
