package com.korartur.secondsession.algorithms3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WordSearchII212 {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        int h = board.length;
        if(h == 0) return res;
        int w = board[0].length;
        if(w == 0) return res;

        int[][] visited = new int[h][w];

        Trie root = new Trie();
        for (String word : words) {
            root.add(word, 0);
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                find(i, j, board, visited, h, w, root.nodes, new StringBuilder(), res);
            }
        }


        return res;
    }

    private void find(int y, int x, char[][] board, int[][] visited, int h, int w, Trie[] tries, StringBuilder word, List<String> res){
        if(y < 0 || x < 0 || y >= h || x >= w) return;
        if(visited[y][x] == 1) return;

        int cIndex = board[y][x] - 'a';
        if(tries[cIndex] == null) return;

        word.append(board[y][x]);

        if(tries[cIndex].isWord){
            res.add(word.toString());
            tries[cIndex].isWord = false;
        }

        visited[y][x] = 1;

        find(y+1, x, board, visited, h, w, tries[cIndex].nodes, word, res);
        find(y-1, x, board, visited, h, w, tries[cIndex].nodes, word, res);
        find(y, x+1, board, visited, h, w, tries[cIndex].nodes, word, res);
        find(y, x-1, board, visited, h, w, tries[cIndex].nodes, word, res);

        word.deleteCharAt(word.length()-1);
        visited[y][x] = 0;
    }


    private class Trie {
        public Trie[] nodes = new Trie[26];
        public boolean isWord = false;

        public void add(String word, int index){
            if(index == word.length()) {
                isWord = true;
            }
            else{
                int ind = word.charAt(index) - 'a';
                if(nodes[ind] == null){
                    nodes[ind] = new Trie();
                }

                nodes[ind].add(word, index+1);
            }
        }
    }
}
