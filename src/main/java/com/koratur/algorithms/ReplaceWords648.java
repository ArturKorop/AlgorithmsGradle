package com.koratur.algorithms;

import java.util.List;

public class ReplaceWords648 {
    public String replaceWords(List<String> dict, String sentence) {

        Node n = new Node();
        for (String w : dict) {
            n.addToTree(w, 0);
        }

        StringBuilder b = new StringBuilder();

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            w = n.getRoot(w);
            b.append(w);
            b.append(' ');
        }

        return b.toString().trim();
    }

    private class Node{
        private Node[] nodes = new Node[27];
        private boolean isEnd;

        public String getRoot(String word){
            int index = 0;
            Node current = this;

            int ch = word.charAt(index);
            int charIndex = ch - 'a';
            while (current.nodes[charIndex] != null) {

                current = current.nodes[charIndex];
                if(current.isEnd) return word.substring(0, index+1);

                index++;
                if(index == word.length()) break;
                charIndex = word.charAt(index) - 'a';

            }

            return word;
        }

        public void addToTree(String word, int index){
            if(index == word.length()) {
                isEnd = true;
                return;
            }

            int charIndex = word.charAt(index) - 'a';
            if(this.nodes[charIndex] == null)
            {
                this.nodes[charIndex] = new Node();
            }

            this.nodes[charIndex].addToTree(word, index+1);
        }
    }

}
