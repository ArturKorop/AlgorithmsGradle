package com.korartur.secondsession.algorithms1;

public class TrappingRainWater42 {
    public int trap(int[] height) {
        if(height.length < 3) return 0;

        int leftMax = height[0];
        int l = 1;

        int rightMax = height[height.length-1];
        int r = height.length-2;

        int result = 0;

        while (l <= r){

            int minMax = Math.min(leftMax, rightMax);
            if(leftMax < rightMax){
                int current = height[l];
                result += Math.max(0, minMax - current);
                leftMax = Math.max(leftMax, current);
                l++;
            }
            else if(leftMax > rightMax){
                int current = height[r];
                result += Math.max(0, minMax - current);
                rightMax = Math.max(rightMax, current);
                r--;
            }
            else{
                int curLeft = height[l];
                result += Math.max(0, minMax - curLeft);
                leftMax = Math.max(leftMax, curLeft);
                l++;

                if(l-1 != r) {
                    int currentRight = height[r];
                    result += Math.max(0, minMax - currentRight);
                    rightMax = Math.max(rightMax, currentRight);
                    r--;
                }
            }
        }

        return result;
    }
}
