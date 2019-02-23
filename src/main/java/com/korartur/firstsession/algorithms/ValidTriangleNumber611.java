package com.korartur.firstsession.algorithms;

import java.util.Arrays;

public class ValidTriangleNumber611 {

    public int triangleNumber(int[] nums) {

        Arrays.sort(nums);

        int res = 0;
        for(int i = 0; i < nums.length-2; i++){
            for(int k = i+1; k < nums.length-1; k++){
                for(int t = k+1; t < nums.length; t++){
                    if(nums[i] + nums[k] <= nums[t]){
                        break;
                    }

                    res++;
                }
            }
        }

        return res;

    }


}
