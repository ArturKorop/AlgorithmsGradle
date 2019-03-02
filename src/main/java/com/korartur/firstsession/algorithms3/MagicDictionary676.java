package com.korartur.firstsession.algorithms3;

import java.util.HashMap;

public class MagicDictionary676 {

    private HashMap<Integer, Node> map = new HashMap<>();

    /** Initialize your data structure here. */
    public MagicDictionary676() {

    }

    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for (int i = 0; i < dict.length; i++) {
            int l = dict[i].length();
            if(!map.containsKey(l)){
                map.put(l, new Node());
            }

            map.get(l).add(dict[i], 0);
        }
    }

    /** Returns if there is any word in the trie that areEqual to the given word after modifying exactly one character */
    public boolean search(String word) {
        int l =  word.length();
        if(!map.containsKey(l)) return false;

        boolean res = map.get(l).findNonStrict(word, 0);

        return res;
    }


    private class Node{
        public Node[] nodes = new Node[26];

        public void add(String s, int index){
            int c = s.charAt(index) - 'a';
            if(nodes[c] == null){
                nodes[c] = new Node();
            }

            if(index == s.length() - 1) return;

            nodes[c].add(s, index+1);


        }


        public boolean findNonStrict(String w, int index){
            int c = w.charAt(index) - 'a';

            if(index == w.length() - 1){
                for(int i = 0; i < 26; i++){
                    if(nodes[i] != null && i != c) return true;
                }
            } else {

                for (int i = 0; i < 26; i++) {
                    if (nodes[i] == null) continue;

                    if (i == c) {
                        if (nodes[i].findNonStrict(w, index + 1)) return true;
                    } else {
                        if (nodes[i].findStrict(w, index + 1)) return true;
                    }

                }
            }


            return false;
        }

        public boolean findStrict(String w, int index){
            int c = w.charAt(index) - 'a';

            if(nodes[c] == null) return false;

            if(index == w.length() - 1) return true;

            return nodes[c].findStrict(w, index+1);
        }
    }



}
