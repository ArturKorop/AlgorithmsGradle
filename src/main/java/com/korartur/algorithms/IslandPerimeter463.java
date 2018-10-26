package com.korartur.algorithms;

public class IslandPerimeter463 {
    public int islandPerimeter(int[][] grid) {
        int result = 0;

        int r = grid.length;
        if(r == 0) return result;

        int c = grid[0].length;
        if(c == 0) return result;

        for (int i = 0; i < r; i++) {
            for (int t = 0; t < c; t++) {

                if(grid[i][t] == 1)
                {
                    if(i == 0){
                        result++;
                    }
                    else if(grid[i-1][t] == 0) {
                        result++;
                    }

                    if(i == r-1){
                        result++;
                    }
                    else if(grid[i+1][t] == 0){
                        result++;
                    }

                    if(t == 0){
                        result++;
                    }
                    else if(grid[i][t-1] == 0) {
                        result++;
                    }

                    if(t == c-1){
                        result++;
                    }
                    else if(grid[i][t+1] == 0){
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
