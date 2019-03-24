package com.korartur.secondsession.algorithms3;

public class ImplementTrie208 {

    private Node _root = new Node();

    public ImplementTrie208() {

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        _root.add(word, 0);
    }


    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return _root.search(word, 0);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return _root.startsWith(prefix, 0);
    }

    private class Node {
        private Node[] _nodes = new Node[26];
        private boolean _isWord = false;

        public void add(String word, int index){
            if(index == word.length()){
                _isWord = true;
                return;
            }

            int wi = word.charAt(index) - 'a';
            if(_nodes[wi] == null){
                _nodes[wi] = new Node();
            }

            _nodes[wi].add(word, index+1);
        }

        public boolean search(String word, int index){
            if(index == word.length()){
                return _isWord;
            }

            int wi = word.charAt(index) - 'a';
            if(_nodes[wi] == null) return false;

            return _nodes[wi].search(word, index+1);
        }

        public boolean startsWith(String prefix, int index){
            if(index == prefix.length()){
                return true;
            }

            int wi = prefix.charAt(index) - 'a';
            if(_nodes[wi] == null) return false;

            return _nodes[wi].startsWith(prefix, index+1);
        }
    }

}
