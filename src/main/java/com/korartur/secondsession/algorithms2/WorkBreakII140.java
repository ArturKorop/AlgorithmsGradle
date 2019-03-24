package com.korartur.secondsession.algorithms2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WorkBreakII140 {
    public List<String> wordBreak(String s, List<String> wordDict) {

        HashMap<Character, List<String>> map = new HashMap<>();
        for (String word : wordDict) {
            char first =  word.charAt(0);
            if(!map.containsKey(first)){
                map.put(first, new ArrayList<>());
            }

            map.get(first).add(word);
        }

        List<String>[] dp = new List[s.length()];

        return comp(s, 0, map, dp);
    }

    private List<String> comp(String s, int from, HashMap<Character, List<String>> map, List<String>[] dp) {
        if (dp[from] != null) return dp[from];

        char first = s.charAt(from);
        if (!map.containsKey(first)) {
            dp[from] = new ArrayList<>();
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();

        List<String> possibleString = map.get(first);
        for (String possible : possibleString) {
            int length = possible.length();
            if (from + length > s.length()) continue;
            if (s.substring(from, from + length).equals(possible)) {
                if (from + length == s.length()) {
                    result.add(possible);
                } else {
                    List<String> other = comp(s, from + length, map, dp);
                    for (String o : other) {
                        String cur = possible + " " + o;
                        result.add(cur);
                    }
                }
            }

        }

        dp[from] = result;

        return result;
    }

}
