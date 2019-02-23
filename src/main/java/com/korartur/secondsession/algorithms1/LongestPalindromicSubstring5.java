package com.korartur.secondsession.algorithms1;

public class LongestPalindromicSubstring5 {
    public String longestPalindrome(String s) {

        if(s.length() < 2) return s;

        int l = s.length();
        char[] arr = s.toCharArray();

        int max = 1;
        int from = 0;
        int to = 0;

        int[][] dp = new int[l][l];
        for(int i = 0; i < l-1; i++){

            for(int j = l-1; j > i; j--){
                int cur = j - i + 1;
                if(cur <= max) continue;

                if(isPal(i, j, dp, arr)){
                    if(cur > max){
                        max  = cur;
                        from = i;
                        to = j;
                    }

                }

            }
        }

        return s.substring(from, to + 1);
    }

    private boolean isPal(int from ,int to, int[][] dp, char[] s){
        if(from == to) return true;
        if(dp[from][to] != 0) return  dp[from][to] == 1;
        if(from == to - 1){
            dp[from][to] = s[from] == s[to] ? 1 : -1;
            return  dp[from][to] == 1;
        }

        if (s[from] == s[to]) {
            if(isPal(from+1, to -1, dp, s)) {
                    dp[from][to] = 1;
                    return true;
                }
            }

        dp[from][to] = -1;
        return false;
    }

    int lo = 0;
    int max = 0;
    public String longestPalindrome2(String s) {
        if(s.length() < 2) return s;

        for(int i = 0; i < s.length()-1;i++){
            tryPal(i, i, s);
            tryPal(i, i+1, s);
        }

        return s.substring(lo, lo + max);
    }

    private void tryPal(int i, int j, String  s){
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }

        if(j - i - 1 > max){
            lo = i+1;
            max = j - i -1;
        }


    }
}
