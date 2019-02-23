package com.korartur.FirstSession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MinimumHeightTrees310Test {
    @Test
    public void test1() {
        var m = new MinimumHeightTrees310();

        int[][] edges = new int[][]{
                {1,0},
                {1,2},
                {1,3}
        };

        var res = m.findMinHeightTrees(4, edges).stream().mapToInt(x->x).toArray();

        Assert.assertArrayEquals(new int[]{1}, res);
    }

    @Test
    public void test2() {
        var m = new MinimumHeightTrees310();

        int[][] edges = new int[][]{
                {0,3},
                {1,3},
                {2,3},
                {4,3},
                {5,4},
        };

        var res = m.findMinHeightTrees(6, edges).stream().mapToInt(x->x).toArray();
        Arrays.sort(res);

        Assert.assertArrayEquals(new int[]{3,4}, res);
    }
}
