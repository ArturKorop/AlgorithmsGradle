package com.korartur.SecondSession.Algorithms1;

public class FindFirsAndLast34 {
    public int[] searchRange(int[] nums, int target) {

        int left=  findLeft(nums, target);
        if(left == -1) return new int[]{-1, -1};

        return new int[]{left, findRight(nums, target)};

    }

    private int findLeft(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;
        int left = -1;

        while (l <= r){

            int mid = l + (r-l)/2;
            int midValue = nums[mid];

            if(midValue == target){
                left = mid;
                r = mid - 1;
            }
            else if(midValue > target){
                r = mid-1;
            }
            else{
                l = mid + 1;
            }
        }


        return left;
    }

    private int findRight(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;
        int right = -1;

        while (l <= r){

            int mid = l + (r-l)/2;
            int midValue = nums[mid];

            if(midValue == target){
                right = mid;
                l = mid + 1;
            }
            else if(midValue > target){
                r = mid-1;
            }
            else{
                l = mid + 1;
            }
        }


        return right;
    }
}
