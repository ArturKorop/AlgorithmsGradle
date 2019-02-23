package com.korartur.FirstSession.algorithms2;

public class WildcardMatching44 {
    public boolean isMatch(String s, String p) {
        if(s.length() == 0 && p.length() == 0) return true;
        if(p.length() == 0) return false;
        int[][] dp = new int[s.length()+1][p.length()+1];
        char[] sc = s.toCharArray();
        char[] pc = p.toCharArray();

        return isPartMatch(sc, pc, 0, 0, dp);
    }

    private boolean isPartMatch(char[] s, char[] p, int sIndex, int pIndex, int[][] dp){
        if(dp[sIndex][pIndex] != 0) return dp[sIndex][pIndex] == 1;

        if(pIndex == p.length && sIndex == s.length) {
            dp[sIndex][pIndex] = 1;
            return true;
        }
        if(pIndex == p.length) {
            dp[sIndex][pIndex] = -1;
            return false;
        }

        if(sIndex == s.length){
            for(int i = pIndex; i < p.length;i++){
                if(p[i] != '*') {
                    dp[sIndex][pIndex] = -1;
                    return false;
                }
            }

            dp[sIndex][pIndex] = 1;
            return true;
        }

        int curPatternChar = p[pIndex];
        if(curPatternChar != '*' && curPatternChar != '?'){
            if(s[sIndex] != curPatternChar) {
                dp[sIndex][pIndex] = -1;
                return false;
            }

            boolean res = isPartMatch(s, p, sIndex+1, pIndex+1, dp);
            dp[sIndex][pIndex] = res ? 1 : -1;
            return res;
        } else if(curPatternChar == '?'){
            boolean res = isPartMatch(s, p, sIndex+1, pIndex+1, dp);
            dp[sIndex][pIndex] = res ? 1 : -1;
            return res;
        } else {
            if(pIndex == p.length - 1) return true;
            while (pIndex < p.length && p[pIndex] == '*'){
                pIndex++;
            }

            if(pIndex == p.length) {
                dp[sIndex][pIndex] = 1;
                return true;
            }

            for(int i = sIndex;i < s.length; i++){
                if(isPartMatch(s, p, i, pIndex, dp)){
                    dp[sIndex][pIndex] = 1;
                    return true;
                }
            }
        }

        dp[sIndex][pIndex] = -1;
        return false;
    }
}
