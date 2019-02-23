package com.korartur.firstsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class UniquePathsII63Test {
    @Test
    public void test1() {
        var u = new UniquePathsII63();
        int[][] matrix = new int[][]{
                {0,0,0},
                {0,1,0},
                {0,0,0},
        };

        Assert.assertEquals(2, u.uniquePathsWithObstacles(matrix));
    }

    @Test
    public void test2() {
        var u = new UniquePathsII63();
        int[][] matrix = new int[][]{
                {0,0,0},
        };

        Assert.assertEquals(1, u.uniquePathsWithObstacles(matrix));
    }
}
