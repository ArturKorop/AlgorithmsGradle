package com.korartur.firstsession.algorithms3;

public class MaxAreaOfIsland695 {
    public int maxAreaOfIsland(int[][] grid) {

        int h = grid.length;
        int w = grid[0].length;

        boolean[][] visited = new boolean[h][w];
        int max = 0;

        for(int i = 0; i < h ; i++){
            for(int k = 0; k < w; k++){
                if(grid[i][k] == 0 || visited[i][k]) continue;

                int cur = getIslandSize(grid, i, k, h, w, visited);
                if(cur > max){
                    max = cur;
                }

            }
        }

        return max;
    }

    private int getIslandSize(int[][] grid, int y, int x, int h, int w, boolean[][] visited) {
        if(y < 0 || y >= h || x < 0 || x >= w) return 0;
        if(visited[y][x]) return 0;
        if(grid[y][x] == 0) return 0;

        visited[y][x] = true;


        int size = 1 + getIslandSize(grid, y+1, x, h, w, visited) +
                getIslandSize(grid, y-1, x, h, w, visited) +
                getIslandSize(grid, y, x-1, h, w, visited) +
                getIslandSize(grid, y, x+1, h, w, visited) ;


        return  size;
    }
}
