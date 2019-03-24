package com.korartur.secondsession.algorithms2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WordBreak139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<Character, List<String>> map = new HashMap<>();
        for (String word : wordDict) {
            char c = word.charAt(0);
            if(!map.containsKey(c)){
                map.put(c, new ArrayList<>());
            }

            map.get(c).add(word);
        }

        return can(s, 0, map, new int[s.length()]);
    }

    private boolean can(String s, int from, HashMap<Character, List<String>> map, int[] dp){
        if(from == s.length()) return true;
        if(dp[from] != 0) return dp[from] > 0;

        char firstChar = s.charAt(from);
        if(!map.containsKey(firstChar)) return false;

        List<String>  possibleStrings = map.get(firstChar);
        for (String possibleString : possibleStrings) {
            int length = possibleString.length();
            if(from + length > s.length()) continue;

            String sub = s.substring(from, from + length);
            if(sub.equals(possibleString)){
                boolean curResult = can(s, from+length, map, dp);
                if(curResult){
                     dp[from] = 1;
                     return true;
                }
            }
        }

        dp[from] = -1;
        return false;
    }


    public boolean wordBreak2(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;

        for(int i = 1 ; i < s.length()+1; i++){
            for(int j = 0; j < i; j++){

                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i] = true;
                }
            }
        }

        return dp[s.length()];
    }

}
