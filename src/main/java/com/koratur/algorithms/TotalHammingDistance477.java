package com.koratur.algorithms;

import java.util.HashMap;

public class TotalHammingDistance477 {
    public int totalHammingDistance(int[] nums) {
        int res = 0;
        int l = nums.length;

        int[] counts = new int[32];

        for (int i = 0; i < l; i++) {
            for (int t = 0; t < 32; t++) {
                int q = (nums[i] >> t) & 1 ;

                if(q == 1)
                {
                    counts[t]++;
                }
            }
        }

        for (int i = 0; i < 32; i++) {
            res += (l - counts[i]) * counts[i];
        }

        return res;
    }


}
