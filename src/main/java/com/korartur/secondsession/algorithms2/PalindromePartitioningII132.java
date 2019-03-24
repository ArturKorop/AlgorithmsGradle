package com.korartur.secondsession.algorithms2;

import java.util.Arrays;

public class PalindromePartitioningII132 {
    public int minCut(String s) {
        int l = s.length();
        int[][] dp = new  int[l][l];
        int[] dp2 = new int[l];
        Arrays.fill(dp2, -1);

        return getCutCount(s, 0, dp, dp2);
    }

    private int getCutCount(String s, int from, int[][] dp, int[] dp2){
        if(from >= s.length()) return 0;
        if(dp2[from] > -1) return dp2[from];

        if(isPal(s, from, s.length()-1, dp)) {
            dp2[from] = 0;
            return 0;
        }

        int res = Integer.MAX_VALUE;
        for(int i = from; i < s.length(); i++){
            if(isPal(s, from, i, dp)){
                int currentRes = 1 + getCutCount(s, i+1, dp, dp2);
                if(currentRes < res){
                    res = currentRes;
                }
            }
        }

        dp2[from] = res;
        return res;
    }

    private boolean isPal(String s, int from, int to, int[][] dp){
        if(from >= to) return true;
        if(dp[from][to] != 0) return dp[from][to] > 0;

        if(s.charAt(from) == s.charAt(to)){
            if(isPal(s, from+1, to-1, dp)){
                dp[from][to] = 1;
                return true;
            }
            else{
                dp[from][to] = -1;
                return false;
            }
        }
        else{
            dp[from][to] = -1;
            return false;
        }
    }

}
