package com.korartur.FirstSession.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MinimumAsciiDeleteSumForTwoStrings712 {

    public int minimumDeleteSum(String s1, String s2) {

        int sum1 = getSum(s1);
        int sum2 = getSum(s2);

        int total = sum1+sum2;


        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int i1 = 0; i1 <= s2.length(); i1++) {
                dp[i][i1] = -1;
            }
        }

        char[] s1a = s1.toCharArray();
        List<Integer>[] s2a = new List[26];
        for (int i = 0; i < 26; i++) {
            s2a[i] = new ArrayList<>();
        }

        for (int i = 0; i < s2.length(); i++) {
            int ci = s2.charAt(i) - 'a';

            s2a[ci].add(i);
        }


        int max = getMaxAscii(s1a, s2a, 0,0,dp);

        return total - max*2;
    }

    private int getMaxAscii(char[] s1, List<Integer>[] s2, int s1Index, int s2Index, int[][] dp) {
        if(dp[s1Index][s2Index] > -1) return dp[s1Index][s2Index];
        int max = 0;
        boolean[] used = new boolean[26];
        int usedCount = 0;

        for(int i = s1Index; i < s1.length; i++){
            if(usedCount == 26) break;

            char c = s1[i];
            int ci = c - 'a';
            if(used[ci]) continue;
            used[ci] = true;
            usedCount++;

            List<Integer> s2a = s2[c - 'a'];
            if(s2a.size() == 0 || s2a.get(s2a.size()-1) < s2Index) continue;

            int s2ai = -1;
            for (int i1 = 0; i1 < s2a.size(); i1++) {
                if(s2a.get(i1) >= s2Index){
                    s2ai = s2a.get(i1);
                    break;
                }
            }

            int curSum = (int)c + getMaxAscii(s1, s2, i+1, s2ai+1, dp);

            if(curSum > max) max = curSum;
        }

        dp[s1Index][s2Index] = max;

        return max;
    }

    private int getSum(String s){
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += (int)s.charAt(i);
        }

        return sum;
    }

}
