package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class SetMatrixZeroes73Test {
    @Test
    public void test1() {
        var s = new SetMatrixZeroes73();
        int[][] m = new int[][]{
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        s.setZeroes(m);

        Assert.assertArrayEquals(new int[]{1,0,1}, m[0]);
        Assert.assertArrayEquals(new int[]{0,0,0}, m[1]);
        Assert.assertArrayEquals(new int[]{1,0,1}, m[2]);

    }
}
