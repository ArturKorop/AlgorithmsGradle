package com.korartur.firstsession.algorithms2;

public class RegularExpressionMatching10 {

    public boolean isMatch(String s, String p) {
        int[][] dp = new int[s.length() + 1][p.length() + 1];
        dp[s.length()][p.length()] = 1;
        for (int i = 0; i < s.length(); i++) {
            dp[i][p.length()] = -1;
        }

        return match(s, p, 0, 0, dp);
    }

    private boolean match(String s, String p, int sIndex, int pIndex, int[][] dp) {
        if (dp[sIndex][pIndex] != 0) return dp[sIndex][pIndex] == 1;

        if (pIndex == p.length() - 1) {
            if (sIndex != s.length() - 1) {
                dp[sIndex][pIndex] = -1;
                return false;
            }

            char pc = p.charAt(pIndex);

            if (pc == '.') {
                dp[sIndex][pIndex] = 1;
                return true;
            } else if (pc == s.charAt(sIndex)) {
                dp[sIndex][pIndex] = 1;
                return true;
            } else {
                dp[sIndex][pIndex] = -1;
                return false;
            }
        } else {
            char pc1 = p.charAt(pIndex);
            char pc2 = p.charAt(pIndex + 1);

            if (pc2 != '*') {

                if (sIndex < s.length() && (pc1 == '.' || pc1 == s.charAt(sIndex))) {
                    boolean res = match(s, p, sIndex + 1, pIndex + 1, dp);
                    dp[sIndex][pIndex] = res ? 1 : -1;
                    return res;
                } else {
                    dp[sIndex][pIndex] = -1;
                    return false;
                }
            } else {
                if (pc1 == '.') {
                    boolean res = false;
                    for (int i = sIndex; i <= s.length(); i++) {
                        if (match(s, p, i, pIndex + 2, dp)) {
                            res = true;
                            break;
                        }
                    }
                    dp[sIndex][pIndex] = res ? 1 : -1;
                    return res;
                } else {
                    boolean res = match(s, p, sIndex, pIndex + 2, dp);
                    if (res) {
                        dp[sIndex][pIndex] = 1;
                        return true;
                    }

                    while (sIndex < s.length() && s.charAt(sIndex) == pc1) {
                        if (match(s, p, sIndex + 1, pIndex + 2, dp)) {
                            res = true;
                            break;
                        }
                        sIndex++;
                    }
                    dp[sIndex][pIndex] = res ? 1 : -1;
                    return res;

                }
            }
        }
    }
}
