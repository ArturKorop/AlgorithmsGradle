package com.korartur.firstsession.algorithms2;

public class DungeonGame174 {
    public int calculateMinimumHP(int[][] dungeon) {

        int height = dungeon.length;
        int width = dungeon[0].length;
        int[][] dp = new int[height][width];

        for(int i = width-1; i >=0; i--){
            for(int j = height-1; j >= 0; j--){

                if(i == width-1 && j == height-1){
                    int cur = dungeon[j][i];
                    if(cur > 0){
                        dp[j][i] = 1;
                    } else {
                        dp[j][i] = -cur + 1;
                    }
                } else {

                    int prev = 0;
                    if(i == width-1){
                        prev=  dp[j+1][i];
                    }  else if(j == height-1){
                        prev = dp[j][i+1];
                    } else {
                        prev = Math.min(dp[j][i+1], dp[j+1][i]);
                    }

                    int cur = dungeon[j][i];

                    if(cur >= prev-1){
                        dp[j][i] = 1;
                    } else {
                        dp[j][i] = prev - cur;
                    }
                }
            }
        }

        return dp[0][0];

    }

}
