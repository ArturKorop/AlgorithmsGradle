package com.korartur.secondsession.algorithms2;

import java.util.List;

public class Triangle120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int width = triangle.size();
        int depth = triangle.get(triangle.size()-1).size();
        Integer[][] dp = new Integer[width][depth];

        for (int i = 0; i < width; i++) {
            for (int i1 = 0; i1 < depth; i1++) {
                dp[i][i1] = null;
            }
        }


        return getMin(triangle, 0, 0, dp);
    }

    private int getMin(List<List<Integer>> input, int height, int width, Integer[][] dp){
        if(height >= input.size() || width >= input.get(height).size()) return 0;

        if(dp[height][width] != null) return dp[height][width];

        int cur = input.get(height).get(width);
        int left = getMin(input, height+1, width, dp);
        int right = getMin(input, height+1, width+1, dp);

        int min = Math.min(left, right);

        int res = cur + min;

        dp[height][width] = res;

        return res;
    }
}
