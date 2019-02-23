package com.korartur.FirstSession.algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestWordInDictionaryThroughDeleting524 {

    public String findLongestWord(String s, List<String> d) {

        String[] sa = d.toArray(new String[]{});

        Comparator<String> byLength = (a,b) -> b.length() - a.length();


        Arrays.sort(sa, byLength.thenComparing(x->x));

        for (int i = 0; i < sa.length; i++) {
            if(isOk(sa[i], s)){
                return sa[i];
            }
        }

        return "";

    }

    private boolean isOk(String word, String target)
    {
        int lastIndex = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            int nextIndex = target.indexOf(c, lastIndex);
            if(nextIndex < 0) return false;

            lastIndex = nextIndex + 1;

        }

        return true;
    }
}
