package com.koratur.algorithms;

public class TeemoAtacking495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0 || duration  == 0) return 0;

        int from = timeSeries[0];
        int to = timeSeries[0] + duration;
        int res = 0;

        for (int i = 1; i < timeSeries.length; i++) {
            if(timeSeries[i] > to) {
                res += to-from;
                from = timeSeries[i];
                to = from + duration;
            }
            else{
                to = timeSeries[i] + duration;
            }
        }

        res += to - from;

       return res;
    }
}
