package com.korartur.algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLenghtOfPairChain646 {
    public int findLongestChain(int[][] pairs) {

        if(pairs.length < 2) return pairs.length;

        Comparator<int[]> a = Comparator.comparingInt(x->x[1]);

        Arrays.sort(pairs, a);


        int first = 0;
        int count = 1;
        for (int i = 1; i < pairs.length; i++) {
            if(pairs[i][0] > pairs[first][1]){
                first = i;
                count++;
            }
        }

        return count;
    }
}
