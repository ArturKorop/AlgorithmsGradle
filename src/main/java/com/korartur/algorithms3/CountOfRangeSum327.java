package com.korartur.algorithms3;

public class CountOfRangeSum327 {

    public int countRangeSum(int[] nums, int lower, int upper) {
        long[] sums = new long[nums.length+1];
        long sum = 0;
        for(int i  = 0; i < nums.length; i++){
            sum += (long)nums[i];
            sums[i+1] = sum;
        }

        int res  = 0;
        for (int i = 1; i < sums.length; i++) {
            for(int q = i; q < sums.length;q++){
                long cur = sums[q] - sums[i-1];
                if(cur >= lower && cur <= upper){
                    res++;
                }
            }
        }

        return res;
    }
}
