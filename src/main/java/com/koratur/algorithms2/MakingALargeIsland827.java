package com.koratur.algorithms2;

public class MakingALargeIsland827 {
    private class Island{
        public int size;
    }

    public int largestIsland(int[][] grid) {

        int l = grid.length;

        boolean[][] visited = new boolean[l][l];
        Island[][] islandsMap = new Island[l][l];

        for (int y = 0; y < l; y++) {
            for (int x = 0; x < l; x++) {
                if(visited[y][x]) continue;
                if(grid[y][x] == 0) continue;

                Island island = new Island();

                fillIsland(island, visited, grid, x, y, islandsMap);

            }
        }


        int res = 0;

        for (int y = 0; y < l; y++) {
            for (int x = 0; x < l; x++) {
                if(grid[y][x] == 0){
                    int cur = 1;

                    Island i1 = getIsland(islandsMap, x-1, y);
                    Island i2 = getIsland(islandsMap, x+1, y);
                    Island i3 = getIsland(islandsMap, x, y-1);
                    Island i4 = getIsland(islandsMap, x, y+1);

                    if(i1 != null){
                        cur += i1.size;
                    }

                    if(i2 != null && i2 != i1){
                        cur += i2.size;
                    }

                    if(i3 != null && i3 != i2 && i3 != i1){
                        cur += i3.size;
                    }

                    if(i4 != null && i4 != i3 && i4 != i2 && i4 != i1){
                        cur += i4.size;
                    }

                    if(cur > res) res = cur;
                }
            }
        }

        return res == 0 ? l * l : res;
    }

    private Island getIsland(Island[][] map, int x, int y){
        if(x < 0 || y < 0 || x >= map.length || y >= map.length) return null;

        return map[y][x];
    }

    private void fillIsland(Island island, boolean[][] visited, int[][] grid, int x, int y, Island[][] islandsMap) {
        if(x < 0 || y < 0 || x >= grid.length || y >= grid.length) return;
        if(visited[y][x]) return;
        if(grid[y][x] == 0) return;

        visited[y][x] = true;
        island.size++;

        islandsMap[y][x] = island;

        fillIsland(island, visited, grid, x-1, y, islandsMap);
        fillIsland(island, visited, grid, x+1, y, islandsMap);
        fillIsland(island, visited, grid, x, y-1, islandsMap);
        fillIsland(island, visited, grid, x, y+1, islandsMap);
    }


}
