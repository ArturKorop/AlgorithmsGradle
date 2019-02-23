package com.korartur.secondsession.algorithms1;

import java.util.TreeSet;

public class KEmptySlots683 {
    public int calculate(int[] flowers, int k){
        if(flowers.length < k + 2) return -1;

        int[] sorted = new int[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            sorted[flowers[i] - 1] = i+1;
        }

        for(int i = 0; i < flowers.length - k - 1; i++){
            int from = sorted[i];
            int to = sorted[i+k+1];

            int max = Math.max(from, to);
            boolean isOk = true;
            for(int t = i+1; t < i+k+1; t++){
                if(sorted[t] < max){
                    isOk = false;
                    break;
                }
            }

            if(isOk){
                return max;
            }
        }

        return -1;
    }

    public int calculate2(int[] flowers, int k){
        if(flowers.length < k + 2) return -1;

        TreeSet<Integer> set = new TreeSet<>();

        int[] sorted = flowers;

        set.add(sorted[0]);
        for (int i = 1; i < sorted.length; i++) {
            set.add(sorted[i]);
            Integer higher = set.higher(sorted[i]);
            Integer lower = set.lower(sorted[i]);

            if(higher != null){
                if(higher - sorted[i] -1  == k) return i + 1;
            }

            if(lower != null){
                if(sorted[i] - lower - 1 == k) return i + 1;
            }
        }

        return -1;
    }
}
