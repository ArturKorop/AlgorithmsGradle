package com.korartur.secondsession.algorithms3;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII229 {
    public List<Integer> majorityElement(int[] nums) {
        int maj1 = 0;
        int count1 = 0;
        int maj2 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if(count1 == 0){
                maj1=  nums[i];
                count1 = 1;
            }
            else if(maj1 == nums[i]){
                count1++;
            }
            else if(count2 == 0){
                maj2 = nums[i];
                count2 = 1;
            }
            else if(maj2 == nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;

                if(count1 == 0){
                    maj1 = maj2;
                    count1 = count2;
                    count2 = 0;
                }
            }
        }

        List<Integer> res = new ArrayList<>();

        count1=  0;
        count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == maj1){
                count1++;
            }

            else if(nums[i] == maj2){
                count2++;
            }

        }

        if(count1 > nums.length/3)
        {
            res.add(maj1);
        }
        if(count2 > nums.length/3){
            res.add(maj2);
        }

        return res;
    }


}
