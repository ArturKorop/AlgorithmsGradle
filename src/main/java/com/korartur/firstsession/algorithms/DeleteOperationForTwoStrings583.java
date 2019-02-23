package com.korartur.firstsession.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DeleteOperationForTwoStrings583 {

    public int minDistance(String word1, String word2) {


        int l1 = word1.length();
        int l2 = word2.length();

        if(l1 == 0 || l2 == 0) return l1 + l2;

        List<Integer>[] w2Indexes = new List[26];

        for (int i = 0; i < 26; i++) {
            w2Indexes[i] = new ArrayList<>();
        }

        for (int i = 0; i < l2; i++) {
            w2Indexes[word2.charAt(i) - 'a'].add(i);
        }

        HashMap<Integer, Integer>[] map = new HashMap[l1];

        for (int i = 0; i < l1; i++) {
            map[i] = new HashMap<>();
        }

        int[] indexes = new int[l1+1];
        for(int i = 0; i < l1+1;i++){
            indexes[i] = -1;
        }

        indexes[1] = getNextIndex(w2Indexes, word1.charAt(0), -1);

        for (int i = 1; i < l1; i++) {

            char c = word1.charAt(i);
            for(int t = i; t >= 0; t--){

                if(indexes[t+1] == -1){

                    if(t == 0){
                        indexes[1] = getNextIndex(w2Indexes, c, -1);
                    }
                    else{

                        if(indexes[t] == -1) continue;

                        int nextIndex = getNextIndex(w2Indexes, c, indexes[t]);

                        if(nextIndex > -1){
                            indexes[t+1] = nextIndex;
                        }

                    }

                }
                else{

                    if(t > 0 && indexes[t] == -1) continue;

                    int nextIndex = getNextIndex(w2Indexes, c, indexes[t]);

                    if(nextIndex > -1 && nextIndex < indexes[t+1]){
                        indexes[t+1] = nextIndex;
                    }
                }
            }
        }

        for(int i = l1; i >= 0; i--){
            if(indexes[i] > -1) return l1 + l2 - i - i;
        }


        return l1+l2;

    }

    private int getNextIndex(List<Integer>[] indexes, char c, int from)
    {
        List<Integer> l = indexes[c - 'a'];

        for (int i = 0; i < l.size(); i++) {

            int cur = l.get(i);

            if(cur > from) return cur;
        }

        return -1;
    }
}
