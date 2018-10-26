package com.korartur.algorithms;

import java.util.HashMap;

public class NumberOfMatchingSubsequence792 {
    public int numMatchingSubseq(String S, String[] words) {

        HashMap<String, Integer> dp = new HashMap<>();

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(findMatch(S, words[i], dp)){
                count++;
            }
        }

        return count;


    }

    private boolean findMatch(String target, String current, HashMap<String, Integer> dp) {

        if(dp.containsKey(current)) return dp.get(current) != -1;

        int index = -1;
        for(int i = 1; i <= current.length(); i++){
            String temp = current.substring(0, i);
            if(dp.containsKey(temp)){
                index = dp.get(temp);
                if(index == -1) break;
            } else {
                index = target.indexOf(current.charAt(i-1), index+1);
                if(index == -1) break;
                dp.put(temp, index);
            }
        }

        dp.put(current, index);

        return index != -1;

    }
}
