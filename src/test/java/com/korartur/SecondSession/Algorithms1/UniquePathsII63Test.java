package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class UniquePathsII63Test {
    @Test
    public void test1() {
        var u = new UniquePathsII63();
        int[][] grid = new int[][]{
                {0,0,0},
                {0,1,0},
                {0,0,0},
        };

        Assert.assertEquals(2, u.uniquePathsWithObstacles(grid));
    }
}
