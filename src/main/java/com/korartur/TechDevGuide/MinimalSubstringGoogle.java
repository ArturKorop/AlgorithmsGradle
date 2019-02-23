package com.korartur.TechDevGuide;

import com.korartur.SecondSession.Algorithms1.InsertInterval57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MinimalSubstringGoogle {
    public String findMinimalSubstring(String s, char[] dict) {
        HashMap<Character, HashSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < dict.length; i++) {
            if (!map.containsKey(dict[i])) {
                HashSet<Integer> set = new HashSet<>();
                set.add(i);
                map.put(dict[i], set);
            } else {
                map.get(dict[i]).add(i);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            boolean found = false;
            if (c == dict[0]) {
                if (result.size() == 0) {
                    List<Integer> curRes = new ArrayList<>();
                    curRes.add(i);
                    result.add(curRes);
                    continue;
                }

                for (int i1 = 0; i1 < result.size(); i1++) {
                    if (result.get(i1).size() == 1) {
                        result.get(i1).set(0, i);
                        found = true;
                        break;
                    }
                }
            }

            if (!map.containsKey(c)) continue;

            HashSet<Integer> possibleIndexes = map.get(c);
            for (int i1 = 0; i1 < result.size(); i1++) {
                List<Integer> cur = result.get(i1);
                if (possibleIndexes.contains(cur.size())) {
                    cur.add(i);
                }
            }

            if (!found && c == dict[0]) {
                List<Integer> curRes = new ArrayList<>();
                curRes.add(i);
                result.add(curRes);
            }
        }

        int min = Integer.MAX_VALUE;
        String res = "";
        for (int i = 0; i < result.size(); i++) {
            List<Integer> cur = result.get(i);
            if (cur.size() == dict.length) {
                int size = cur.get(cur.size() - 1) - cur.get(0);
                if (size < min) {
                    min = size;
                    res = s.substring(cur.get(0), cur.get(cur.size() - 1) + 1);
                }
            }
        }

        return res;
    }

    public String findMinimalSubstring2(String s, char[] dict) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < dict.length; i++) {
                map.put(dict[i], i);
        }

        String res = "";
        int min = Integer.MAX_VALUE;

        HashMap<Integer, List<Integer>> currentSequences = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) continue;

            int possibleIndex = map.get(c);

            List<Integer> update = new ArrayList<>();
            if (possibleIndex == 0) {
                update.add(i);
            } else {
                if (!currentSequences.containsKey(possibleIndex)) continue;

                update = currentSequences.get(possibleIndex);
                currentSequences.remove(possibleIndex);
                update.add(i);
            }

            currentSequences.put(update.size(), update);

            if (update.size() == dict.length) {
                int curSize = update.get(update.size() - 1) - update.get(0);
                if (curSize < min) {
                    min = curSize;
                    res = s.substring(update.get(0), update.get(update.size() - 1) + 1);
                }
            }
        }

        return res;
    }
}
