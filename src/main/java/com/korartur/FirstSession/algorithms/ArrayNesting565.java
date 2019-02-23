package com.korartur.FirstSession.algorithms;

public class ArrayNesting565 {

    public int arrayNesting(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == -1) continue;

            int curIndex = i;
            int count = 0;
            while (curIndex != -1)
            {
                int c = nums[curIndex];
                nums[curIndex] = -1;
                count++;

                curIndex = c;
            }

            if(count - 1 > max)
            {
                max = count - 1;
            }

        }

        return max;

    }
}
