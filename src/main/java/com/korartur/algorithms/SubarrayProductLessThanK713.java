package com.korartur.algorithms;

public class SubarrayProductLessThanK713 {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int res = 0;

        int l = nums.length;


        int[][] dp = new int[l+1][2];

        for(int i = 1; i <= l; i++) {
            if(dp[i-1][1] == 0) {
                int cur = nums[i-1];

                if(cur >= k) continue;

                int prod = cur;
                int index = i;

                while (index < l) {
                    if(prod * nums[index] < k){
                        prod = prod * nums[index];
                        index++;
                    } else {
                        break;
                    }
                }

                res += index - i + 1;
                dp[i] = new int[]{prod, index - i + 1};
            } else {
                int curProd = dp[i-1][0] / nums[i-2];
                int index = dp[i-1][1] - 2 + i;
                while (index < l) {
                    if(curProd * nums[index] < k){
                        curProd = curProd * nums[index];
                        index++;
                    } else{
                        break;
                    }
                }

                res += index - i + 1;
                dp[i] = new int[]{curProd, index - i + 1};
            }
        }


        return res;
    }
}
