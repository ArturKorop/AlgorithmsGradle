package com.korartur.SecondSession.Algorithms1;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations17 {
    public List<String> letterCombinations(String digits) {
        char[][] map = new char[][]{
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
                {'j', 'k', 'l'},
                {'m', 'n', 'o'},
                {'p', 'q', 'r', 's'},
                {'t', 'u', 'v'},
                {'w', 'x', 'y', 'z'},
        };

        List<String> res = new ArrayList<>();
        res.add("");

        for (int i = 0; i < digits.length(); i++) {
            int d = digits.charAt(i) - '2';
            char[] cur = map[d];

            List<String> temp = new ArrayList<>();

            for (int i1 = 0; i1 < res.size(); i1++) {
                for(int t = 0; t < cur.length; t++){
                    temp.add(res.get(i1) + cur[t]);
                }
            }

            res = temp;
        }

        return res;
    }
}
