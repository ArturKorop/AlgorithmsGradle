package com.korartur.firstsession.algorithms;

import java.util.ArrayList;
import java.util.List;

public class ShortEncodingOfWords820 {
    public int minimumLengthEncoding(String[] words) {

        Node n = new Node();

        List<String>[] s = new List[8];
        for (int i = 0; i < 8; i++) {
            s[i] = new ArrayList<>();
        }

        for (int i = 0; i < words.length; i++) {
            int ind = words[i].length();
            s[ind].add(words[i]);
        }

        int res=  0;
        for(int i = 7; i >=1; i--){
            List<String> sw = s[i];
            for (String s1 : sw) {

                if(!n.containsOrAdd(s1, s1.length()-1)){
                    res += s1.length() + 1;
                }
            }
        }

        return res;
    }

    private class Node{
        private Node[] nodes = new Node[26];

        public boolean containsOrAdd(String word, int index){
            if(index == -1) return true;

            int ind = word.charAt(index) - 'a';

            if(nodes[ind] != null){
                return nodes[ind].containsOrAdd(word, index-1);
            } else {
                Node n = new Node();
                nodes[ind] = n;
                n.containsOrAdd(word, index-1);

                return false;
            }
        }

    }
}
