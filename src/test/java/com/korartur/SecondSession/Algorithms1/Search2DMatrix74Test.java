package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class Search2DMatrix74Test {
    @Test
    public void test1() {
        var s = new Search2DMatrix74();
        int[][] m = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50},
        };

        Assert.assertTrue(s.searchMatrix(m, 3));
    }

    @Test
    public void test2() {
        var s = new Search2DMatrix74();
        int[][] m = new int[][]{
                {1},
        };

        Assert.assertFalse(s.searchMatrix(m, 2));
    }
}
