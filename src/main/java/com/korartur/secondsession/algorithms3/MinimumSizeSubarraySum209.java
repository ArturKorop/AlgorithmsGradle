package com.korartur.secondsession.algorithms3;

public class MinimumSizeSubarraySum209 {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length < 1) return 0;

        int result = Integer.MAX_VALUE;
        int from = 0;
        int sum = nums[0];
        if(sum >= s) return 1;

        for(int i = 1; i < nums.length; i++){
            sum += nums[i];
            if(sum >= s){

                for(int t = from; t < i; t++){
                    if(sum - nums[t] >= s) {
                        sum -= nums[t];
                        from++;
                    }
                    else {
                        break;
                    }
                }

                result = Math.min(result, i - from + 1);
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
