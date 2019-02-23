package com.korartur.SecondSession.Algorithms1;

public class SortColors75 {
    public void sortColors(int[] nums) {

        int l = 0;
        int r = nums.length-1;

        int left1 = -1;
        int right1 = -1;

        while (l <= r){

            while (l < nums.length && nums[l] == 0){
                if(left1 == -1) {
                }
                else{
                    nums[left1] = 0;
                    nums[l] = 1;
                    left1++;
                }
                l++;
            }

            while (r >= 0 && nums[r] == 2){
                if(right1 == -1) {
                }
                else{
                    nums[right1] = 2;
                    nums[r] = 1;
                    right1--;
                }
                r--;
            }

            if(l >= r) break;

            if(nums[l] == 2 && nums[r] == 0){
                if(left1 == -1) {
                    nums[l] = 0;
                }
                else{
                    nums[left1] = 0;
                    left1++;
                    nums[l] = 1;
                }

                if(right1 == -1) {
                    nums[r] = 2;
                }
                else{
                    nums[right1] = 2;
                    right1--;
                    nums[r] = 1;
                }
                l++;
                r--;
            }
            else{
                if(nums[l] == 1){
                    if(left1 == -1){
                        left1 = l;
                    }
                }

                if(nums[r] == 1){
                    if(right1 == -1){
                        right1 = r;
                    }
                }

                if(nums[r]== 1 && nums[l] == 1){
                    l++;
                    r--;
                }
                else{
                    if(nums[r] == 0){
                        nums[left1]  = 0;
                        left1++;
                        nums[r] = 1;

                        if(left1 >= l){
                            left1 = -1;
                        }
                    }
                    else{
                        nums[right1] = 2;
                        right1--;
                        nums[l] = 1;

                        if(right1 <= r){
                            right1 = -1;
                        }
                    }
                }
            }
        }
    }
}
