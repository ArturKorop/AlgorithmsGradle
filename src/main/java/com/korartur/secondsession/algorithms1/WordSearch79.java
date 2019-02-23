package com.korartur.secondsession.algorithms1;

import java.util.*;

public class WordSearch79 {
    public boolean exist(char[][] board, String word) {
        HashMap<Character, List<Point>> symMap = new HashMap<>();
        int h = board.length;
        int w = board[0].length;

        for (int i = 0; i < h; i++) {
            for (int k = 0; k < w; k++) {
                Point p = new Point(i,k);
                char c = board[i][k];

                if(!symMap.containsKey(c)){
                    List<Point> list = new ArrayList<>();
                    list.add(p);
                    symMap.put(c, list);
                }
                else{
                    symMap.get(c).add(p);
                }
            }
        }

        char first = word.charAt(0);
        if(!symMap.containsKey(first)){
            return false;
        }

        List<Point> points = symMap.get(first);
        boolean[][] visited = new boolean[h][w];
        for (Point point : points) {
            if(find(board, point.x, point.y, word, 0, visited)){
                return true;
            }
        }

        return false;

    }

    private boolean find(char[][] board, int x, int y, String word, int wordIndex, boolean[][] visited){
        if(x <0 || y < 0 || x >= board.length || y >= board[0].length) return false;

        if(visited[x][y]) return false;

        char desired = word.charAt(wordIndex);
        if(board[x][y] != desired){
            return false;
        }

        if(wordIndex == word.length() - 1){
            return true;
        }

        visited[x][y] = true;

        if(find(board, x-1, y, word, wordIndex+1, visited)){
            return true;
        }

        if(find(board, x+1, y, word, wordIndex+1, visited)){
            return true;
        }

        if(find(board, x, y-1, word, wordIndex+1, visited)){
            return true;
        }

        if(find(board, x, y+1, word, wordIndex+1, visited)){
            return true;
        }

        visited[x][y] = false;

        return false;
    }

    private class Point{
        public int x;
        public int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
