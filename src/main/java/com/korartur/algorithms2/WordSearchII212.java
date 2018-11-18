package com.korartur.algorithms2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WordSearchII212 {
    public List<String> findWords(char[][] board, String[] words) {

        int h = board.length;
        int w=  board[0].length;

        Node root = new Node();

        for (int i = 0; i < words.length; i++) {
            root.add(words[i], 0);
        }

        HashSet<String> res = new HashSet<>();
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {

                find(root, board, y, x, h, w, res);

            }
        }

        return new ArrayList<>(res);
    }

    private void find(Node root, char[][] board, int y, int x, int h, int w, HashSet<String> res) {
        if(root.word != null) res.add(root.word);
        if(x < 0 || y < 0 || x >= w || y >= h) return;

        char temp = board[y][x];
        if(temp == '0') return;


        int c = temp - 'a';
        if(root.children[c] == null) return;


        board[y][x] = '0';

        find(root.children[c], board, y+1, x, h,w, res);
        find(root.children[c], board, y-1, x, h,w, res);
        find(root.children[c], board, y, x+1, h,w, res);
        find(root.children[c], board, y, x-1, h,w, res);

        board[y][x] = temp;
    }

    private class Node{
        public Node[] children = new Node[26];
        public String word;

        public void add(String word, int index){
            if(index == word.length()){
                this.word = word;
            } else {
                int c = word.charAt(index) - 'a';
                if(children[c] == null){
                    children[c] = new Node();
                }

                children[c].add(word, index+1);
            }
        }
    }



}
