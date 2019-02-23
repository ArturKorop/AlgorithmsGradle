package com.korartur.firstsession.algorithms3;

import java.util.Arrays;

public class MaximumGap164 {
    public int maximumGap(int[] nums) {
        if(nums.length < 2) return 0;
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
        }

        if(min == max ) return 0;

        int bucketSize = (int)Math.ceil((double) (max - min)/(nums.length-1));
        int bucketCount = (int)Math.ceil((double)(max-min)/bucketSize);
        int[] minBuckets = new int[bucketCount];
        int[] maxBuckets = new int[bucketCount];

        Arrays.fill(minBuckets, Integer.MAX_VALUE);
        Arrays.fill(maxBuckets, 0);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == min || nums[i] ==max)continue;

            int bucketIndex = (nums[i] - min)/bucketSize;
            if(minBuckets[bucketIndex] > nums[i]){
                minBuckets[bucketIndex] = nums[i];
            }

            if(maxBuckets[bucketIndex] < nums[i]){
                maxBuckets[bucketIndex] = nums[i];
            }
        }

        int curMin = min;
        int gap = 0;

        for (int i = 0; i < bucketCount; i++) {
            if(maxBuckets[i] == 0) continue;

            if(minBuckets[i] - curMin > gap){
                gap = minBuckets[i] - curMin;
            }

            curMin = maxBuckets[i];
        }

        if(max - curMin > gap) gap = max - curMin;

        return gap;

    }
}
