package com.korartur.FirstSession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class MaxAreaOfIsland695Test {
    @Test
    public void test1() {
        var m = new MaxAreaOfIsland695();
        int[][] grid = new int[][]
        {
                {0,0,1,0,1},
                {0,0,1,1,1},
                {0,0,1,0,1},
                {0,0,0,0,0},
                {0,0,1,0,1},
        };

        Assert.assertEquals(7, m.maxAreaOfIsland(grid));
    }
}
