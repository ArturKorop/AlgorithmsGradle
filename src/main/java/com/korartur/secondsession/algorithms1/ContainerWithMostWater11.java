package com.korartur.secondsession.algorithms1;

public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int max = 0;

        while (l < r){
            int lMax = height[l];
            int rMax = height[r];

            int curMax = (r-l) * Math.min(lMax, rMax);

            if(curMax > max){
                max = curMax;
            }

            if(lMax > rMax){
                r--;
            }
            else if(lMax < rMax){
                l++;
            }
            else{
                l++;
                r--;
            }
        }

        return max;
    }
}
