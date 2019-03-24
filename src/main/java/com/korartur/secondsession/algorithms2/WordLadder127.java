package com.korartur.secondsession.algorithms2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WordLadder127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        List<String> w = new ArrayList<>();
        w.add(beginWord);
        w.addAll(wordList);

        int l = w.size();
        List<Integer>[] dp = new List[l];

        int requiredIndex = -1;

        for (int i = 0; i < w.size(); i++) {
            dp[i] = new ArrayList<>();
        }

        for (int i = 0; i < l - 1; i++) {
            if (w.get(i + 1).equals(endWord)) {
                requiredIndex = i+1;
            }
            for (int t = i + 1; t < l; t++) {
                int diff = getDiff(w.get(i), w.get(t));
                if(diff == 1) {
                    dp[i].add(t);
                    dp[t].add(i);
                }
            }
        }

        if (requiredIndex == -1) return 0;

        List<Integer> indexes = new ArrayList<>();
        indexes.add(0);

        int[] distance = new int[l];

        int path = 1;
        boolean any = true;
        while (any) {
            any = false;
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < indexes.size(); i++) {
                int index = indexes.get(i);

                List<Integer> list  = dp[index];


                for (int t = 0; t < list.size(); t++) {
                    int curInd = list.get(t);
                    if (curInd == requiredIndex) return path + 1;

                    if (distance[curInd] == 0) {
                        distance[curInd] = path;
                        temp.add(curInd);
                        any = true;
                    }
                }

            }

            indexes = temp;

            path++;
        }

        return 0;
    }

    private int getDiff(String s1, String s2){
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)){
                diff++;
                if(diff > 1) return 100;
            }
        }

        return diff;
    }
}
