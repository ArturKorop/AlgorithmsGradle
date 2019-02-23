package com.korartur.SecondSession.Algorithms1;

public class RemoveDuplicatesFromSortedArrayII80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3) return nums.length;

        int index = 1;
        int count = 1;
        int prev = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == prev){
                count++;
            }
            else{
                prev = nums[i];
                count = 1;
            }

            if(count > 2) continue;

            nums[index] = nums[i];
            index++;
        }

        return index;
    }
}
