package com.korartur.firstsession.algorithms3;

public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        int nextIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                if(nextIndex == i) {
                    nextIndex++;
                    continue;}

                nums[nextIndex] = nums[i];
                nextIndex++;
            }
        }

        for(int i = nextIndex; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
