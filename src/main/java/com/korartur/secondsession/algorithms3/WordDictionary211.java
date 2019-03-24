package com.korartur.secondsession.algorithms3;

public class WordDictionary211 {

    private Node _node = new Node();

    /** Initialize your data structure here. */
    public WordDictionary211() {

    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        _node.add(word, 0);
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return _node.search(word, 0);
    }

    private class Node{
        private Node[] _nodes = new Node[26];
        private boolean _isWord;

        public void add(String word, int index){
            if(index == word.length()){
                _isWord = true;
            }
            else{
                int ind = word.charAt(index) - 'a';
                if(_nodes[ind] == null){
                    _nodes[ind] = new Node();
                }

                _nodes[ind].add(word, index+1);
            }
        }

        public boolean search(String word, int index){
            if(index == word.length()){
                return _isWord;
            }

            char c =  word.charAt(index);
            if(c == '.'){
                for (int i = 0; i < 26; i++) {
                    if(_nodes[i] != null){
                        if(_nodes[i].search(word, index+1)){
                            return true;
                        }
                    }
                }
            }
            else{
                int ind = c - 'a';
                if(_nodes[ind] == null) return false;
                return _nodes[ind].search(word, index+1);
            }

            return false;
        }
    }
}

