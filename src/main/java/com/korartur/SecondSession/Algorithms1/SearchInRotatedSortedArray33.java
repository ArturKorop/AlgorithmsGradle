package com.korartur.SecondSession.Algorithms1;

import java.util.Arrays;

public class SearchInRotatedSortedArray33 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0] == target ? 0 : -1;
        if (nums[nums.length - 1] > nums[0]) {
            int res = Arrays.binarySearch(nums, target);
            return res < 0 ? -1 : res;
        }

        int mid = getMid(nums);

int res = 0;
        if(target < nums[0]){
           res = Arrays.binarySearch(nums, mid+1, nums.length, target);
        }
        else{
            res = Arrays.binarySearch(nums, 0, mid+1, target);
        }

        return  res < 0 ? -1 : res;
    }

    private int getMid(int[] nums){
        int l = 0;
        int r = nums.length -1;
        while (l < r){

            int mid = l + (r-l)/2;
            int midValue = nums[mid];

            if(midValue > nums[mid+1]){
                return mid;
            }
            else if(midValue < nums[mid-1]){
                return mid-1;
            }


            if(midValue > nums[l]){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }

        return -1;
    }
}
