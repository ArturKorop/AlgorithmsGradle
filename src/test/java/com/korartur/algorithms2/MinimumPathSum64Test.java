package com.korartur.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class MinimumPathSum64Test {
    @Test
    public void test1() {
        var m = new MinimumPathSum64();

        int[][] data = new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1},
        };

        Assert.assertEquals(7, m.minPathSum(data));

    }
}
