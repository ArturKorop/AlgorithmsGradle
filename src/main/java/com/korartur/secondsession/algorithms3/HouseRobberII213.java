package com.korartur.secondsession.algorithms3;

public class HouseRobberII213 {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1)  return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        if(nums.length == 3) return Math.max(nums[0], Math.max(nums[1], nums[2]));
        if(nums.length == 4) return Math.max(nums[0] + nums[2], nums[1] + nums[3]);



        int prev = 0;
        int cur = nums[0];

        for(int i = 1; i < nums.length-1; i++){
            int temp = cur;
            cur = Math.max(prev + nums[i], cur);
            prev = temp;
        }

        int max = Math.max(cur, prev);

        prev = 0;
        cur = nums[nums.length-1];

        for(int i = nums.length-2; i>=1; i--){
            int temp = cur;
            cur = Math.max(prev + nums[i], cur);
            prev = temp;
        }

        return Math.max(max, Math.max(cur, prev));
    }
}
