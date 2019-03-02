package com.korartur.secondsession.algorithms1;

import java.lang.annotation.Retention;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInRotatedSortedArrayII81 {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0 ) return false;
        if(nums.length == 1) return nums[0] == target;

        if(nums[0] < nums[nums.length-1]) return Arrays.binarySearch(nums, target) >= 0;

        int firstNonDuplicate = getFirstNonDuplicate(nums, nums[nums.length-1], 0, nums.length-1);

        if(firstNonDuplicate == -1) return nums[0] == target;

        if(nums[firstNonDuplicate] < nums[nums.length-1]) return Arrays.binarySearch(nums, firstNonDuplicate, nums.length, target) >= 0;

        int pivot = getPivot(nums, firstNonDuplicate);


        int left = Arrays.binarySearch(nums, 0, pivot, target);
        if(left >= 0) return true;
        int right = Arrays.binarySearch(nums, pivot, nums.length, target);

        return right >= 0;
    }

    private int getPivot(int[] nums, int firstNonDuplicate){

        int l =firstNonDuplicate;
        int r = nums.length-1;

        while (l <= r){
            int mid = l + (r-l)/2;
            int midValue = nums[mid];

            if(mid == 0){
                if(midValue > nums[mid+1]){
                    return mid+1;
                }

                return 0;
            }

            if(midValue < nums[mid-1]){
                return mid;
            }

            if(midValue >= nums[firstNonDuplicate]){
                l = mid+1;
            }
            else{
                r = mid - 1;
            }
        }

        return 0;
    }

    private int getFirstNonDuplicate(int[] nums, int target, int from, int to){
        if(from > to) return -1;
        if(from == to) return nums[from] == target ? -1 : from;
        if(nums[from] != target) return from;

        int l = from;
        int r =  to;

        while (l <= r){
            int mid = l + (r-l)/2;

            if(nums[mid] == target){
                int left=  getFirstNonDuplicate(nums, target, from, mid-1);
                if(left > 0) return left;

                return getFirstNonDuplicate(nums, target, mid+1, to);
            }
            else{
                return getFirstNonDuplicate(nums, target, from, mid);
            }
        }

        return -1;
    }

}
