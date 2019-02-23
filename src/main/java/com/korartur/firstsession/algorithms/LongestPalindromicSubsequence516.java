package com.korartur.firstsession.algorithms;

public class LongestPalindromicSubsequence516 {

    public int longestPalindromeSubseq(String s) {

        int l = s.length();
        if(l <= 1) return l;

        int[][] dp = new int[l][l];

        for (int i = 0; i < l; i++) {
            for (int t = 0; t < l; t++) {
                dp[i][t] = -1;
            }
        }

        char[] sc = s.toCharArray();
        int max = getMax(sc, 0, l-1, dp);

        return max;
    }

    private int getMax(char[] s, int from, int to, int[][] dp) {

        if(from == to) return 1;
        if(from > to) return 0;
        if(dp[from][to] > -1) return dp[from][to];

        int max = -1;
        boolean[] visited = new boolean[26];

        for(int i = from; i < to; i++){

            char c = s[i];
            if(visited[c - 'a']) continue;

            visited[c-'a'] = true;

            for(int k = to; k > i; k--){
                if(s[k] == c){
                    max = Math.max(max, 2 + getMax(s, i+1, k - 1, dp));
                    break;
                }
            }

            if(max >= to - from - 1) break;
        }

        dp[from][to] = max > 0 ? max : 1;

        return dp[from][to];

    }

}
