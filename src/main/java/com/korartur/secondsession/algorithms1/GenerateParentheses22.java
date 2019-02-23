package com.korartur.secondsession.algorithms1;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {
    public List<String> generateParenthesis(int n) {
        List<String>[][] dp = new List[n+1][n+1];
        return generate(n, n, dp);
    }

    private List<String> generate(int open, int close, List<String>[][] dp) {
        if(dp[open][close] != null) return dp[open][close];

        List<String> res = new ArrayList<>();
        if (open == 0) {
            String s = ")";
            for (int i = 1; i < close; i++) {
                s += ")";
            }

            res.add(s);

            dp[open][close] = res;

            return res;
        }


        List<String> l = generate(open - 1, close, dp);
        for (String s : l) {
            res.add("(" + s);
        }

        if(open < close) {
            List<String> l2 = generate(open, close - 1, dp);
            for (String s : l2) {
                res.add(")" + s);
            }
        }

        dp[open][close] = res;
        return res;
    }
}
