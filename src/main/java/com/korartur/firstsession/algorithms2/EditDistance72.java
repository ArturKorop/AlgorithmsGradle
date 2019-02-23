package com.korartur.firstsession.algorithms2;

public class EditDistance72 {
    public int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int[][] dp = new int[l1][l2];
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                dp[i][j] = -1;
            }
        }

        int res = getMin(word1, word2, 0, 0, dp);

        return res;
    }

    private int getMin(String word1, String word2, int i1, int i2, int[][] dp){
        if(i1 == word1.length()) return word2.length() - i2;
        if(i2 == word2.length()) return word1.length() - i1;

        if(dp[i1][i2] >= 0) return dp[i1][i2];

        if(word1.charAt(i1) == word2.charAt(i2)){
            dp[i1][i2] = getMin(word1, word2, i1+1, i2+1, dp);
            return dp[i1][i2];
        } else {
            int m1 = getMin(word1, word2, i1+1,i2, dp);
            int m2 = getMin(word1, word2, i1, i2+1,dp);
            int m3= getMin(word1, word2, i1+1, i2+1, dp);

            int min = Math.min(m1, m2);
            min = Math.min(min, m3) + 1;

            dp[i1][i2] = min;
            return min;
        }

    }
}
