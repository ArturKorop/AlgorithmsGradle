package com.korartur.secondsession.algorithms3;

public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;

        for(int i = 1; i < nums.length; i++){
            if(count == 0){
                major = nums[i];
                count = 1;
            }
            else {
                if (nums[i] == major) {
                        count++;
                }
                else{
                    count--;
                }
            }

        }

        return major;
    }

}
