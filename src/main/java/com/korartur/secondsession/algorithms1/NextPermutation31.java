package com.korartur.secondsession.algorithms1;

import java.util.Arrays;

public class NextPermutation31 {
    public void nextPermutation(int[] nums) {
        if (nums.length < 2) return;

        int max = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < max) {
                int minButMoreThanCurrentIndex = -1;
                int minButMoreThanCurrent = -1;

                for (int k = i + 1; k < nums.length; k++) {
                    if (nums[k] > nums[i]) {
                        if (minButMoreThanCurrentIndex == -1) {
                            minButMoreThanCurrent = nums[k];
                            minButMoreThanCurrentIndex = k;
                        } else {
                            if (nums[k] <= minButMoreThanCurrent) {
                                minButMoreThanCurrent = nums[k];
                                minButMoreThanCurrentIndex = k;
                            }
                        }
                    }
                }

                nums[minButMoreThanCurrentIndex] = nums[i];
                nums[i] = minButMoreThanCurrent;
                Arrays.sort(nums, i+1, nums.length);
                return;
            } else {
                max = nums[i];
            }
        }

        int i = 0;
        int j = nums.length -1;
        while (i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

}
