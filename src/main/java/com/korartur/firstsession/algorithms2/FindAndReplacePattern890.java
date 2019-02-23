package com.korartur.firstsession.algorithms2;

import java.util.LinkedList;
import java.util.List;

public class FindAndReplacePattern890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        int[] patternNum = new int[pattern.length()];
        int[] diffData = new int[26];
        for (int i = 0; i < pattern.length(); i++) {
            patternNum[i] = pattern.charAt(i) - 'a' + 1;
            diffData[patternNum[i] - 1]++;
        }

        int diff = 0;
        for (int i = 0; i < diffData.length; i++) {
            if(diffData[i] != 0) diff++;
        }

        List<String> res = new LinkedList<>();
        for (String word : words) {
            if(isMatch(patternNum, diff, word)){
                res.add(word);
            }
        }

        return res;
    }

    private boolean isMatch(int[] pattern, int diff, String word){
        int[] data = new int[27];
        int curDiff = 0;
        for (int i = 0; i < word.length(); i++) {
            int ind = word.charAt(i) - 'a' + 1;
            if(data[ind] == 0){
                data[ind] = pattern[i];
                curDiff++;
                if(curDiff > diff) return false;
            } else {
                if(data[ind] != pattern[i]) return false;
            }
        }

        return true;
    }
}
