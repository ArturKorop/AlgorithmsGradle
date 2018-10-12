package com.koratur.algorithms2;

public class UniqueLetterString828 {
    public int uniqueLetterString(String S) {
        long res = 0;

        long[] dp = new long[S.length()];
        int[] used = new int[26];
        long count = 0;

        for (int i = 0; i < S.length(); i++) {

            int ind = S.charAt(i) - 'A';
            if (used[ind] == 0) {
                used[ind] = 1;
                count++;
                res += count;
            } else if (used[ind] == 1) {
                count--;
                used[ind] = -1;
                res += count;
            } else {
                res += count;
            }

            dp[i] = count;
        }

        long totalPrev = res;


        for(int t = 1; t < S.length(); t++) {

            char prev = S.charAt(t-1);
            int prevCount = 0;
            used = new int[26];
            count = 0;
            long partPrev = dp[t-1];
            long partCur = 0;

            for (int i = t; i < S.length(); i++) {
                if(S.charAt(i) == prev){
                    prevCount++;
                    if(prevCount == 2) {
                        break;
                    }
                }

                int ind = S.charAt(i) - 'A';
                if (used[ind] == 0) {
                    used[ind] = 1;
                    count++;
                    partCur += count;
                } else if (used[ind] == 1) {
                    count--;
                    used[ind] = -1;
                    partCur += count;
                } else {
                    partCur += count;
                }

                partPrev += dp[i];
                dp[i] = count;
            }

            res += partCur;
            res += totalPrev - partPrev;
            totalPrev = totalPrev - partPrev + partCur;
        }


        return (int)(res % 1000000007);
    }
}
