package com.korartur.algorithms;

public class MaxChunksToMakeSorted769 {
    public int maxChunksToSorted(int[] nums) {

        int index = -1;

        int count = 0;
        for(int i = 0; i < nums.length; i++){

            if(i == -1){
                if(nums[i] == i){
                    count++;
                } else{
                    index = nums[i];
                }
            } else {
                if(nums[i] > index){
                    index = nums[i];
                }
            }

            if(i == index){
                count++;
                index = -1;
            }
        }


        return count;

    }
}
